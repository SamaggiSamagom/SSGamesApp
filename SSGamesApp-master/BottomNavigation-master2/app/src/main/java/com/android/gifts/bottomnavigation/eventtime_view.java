package com.android.gifts.bottomnavigation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class eventtime_view extends AppCompatActivity {
    WebView browser;
    String url = "http://samaggisamagom.org/samaggi-games-2017-2/samaggi-games-event-timetable/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.eventtime_view);
        browser = (WebView) findViewById(R.id.webview1);
        browser.loadUrl(url);
    }

}