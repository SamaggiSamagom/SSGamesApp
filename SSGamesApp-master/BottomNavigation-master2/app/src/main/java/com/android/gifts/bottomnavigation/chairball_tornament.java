package com.android.gifts.bottomnavigation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class chairball_tornament extends AppCompatActivity {
    WebView browser;
    String url = "http://challonge.com/peterith";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.chairball_tornament);
        browser = (WebView) findViewById(R.id.webview1);
        browser.loadUrl(url);
    }

}