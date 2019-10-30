package com.example.praticafaculdade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.editText1);

        Button button = (Button) findViewById(R.id.button1);

         final WebView webView = (WebView) findViewById(R.id.webView1);
         webView.setWebViewClient(new HelloWebViewClient());
         webView.getSettings().setJavaScriptEnabled(true);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                String endereco = editText.getText().toString();
                Log.d("LAC","Clique no Botão com: " + endereco);
                webView.loadUrl(endereco);
            }
        });
    }
}
