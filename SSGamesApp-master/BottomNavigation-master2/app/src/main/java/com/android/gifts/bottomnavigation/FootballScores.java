package com.android.gifts.bottomnavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

import com.android.gifts.bottomnavigation.FourButtonsActivity;
import com.android.gifts.bottomnavigation.R;

import java.util.Timer;
import java.util.TimerTask;

public class FootballScores extends AppCompatActivity {
    WebView browser;
    String url = "http://challonge.com/ssbatmintonmixed2017";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.new_view);
        browser = (WebView) findViewById(R.id.webview1);
        browser.loadUrl(url);
    }

}