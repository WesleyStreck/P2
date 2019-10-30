package com.example.praticafaculdade;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HelloWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull WebView view, String url){
        view.loadUrl(url);
        return true;
    }
}
