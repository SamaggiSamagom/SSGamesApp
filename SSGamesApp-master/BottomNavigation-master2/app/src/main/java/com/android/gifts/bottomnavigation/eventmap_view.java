package com.android.gifts.bottomnavigation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class eventmap_view extends AppCompatActivity {
    WebView browser;
    String url = "http://samaggisamagom.org/samaggi-games-2017-2/samaggi-games-map/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.eventmap_view);
        browser = (WebView) findViewById(R.id.webview1);
        browser.loadUrl(url);
    }

}