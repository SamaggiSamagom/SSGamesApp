package com.android.gifts.bottomnavigation.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

import com.android.gifts.bottomnavigation.R;
import com.android.gifts.bottomnavigation.bus_view;
import com.android.gifts.bottomnavigation.eventmap_view;
import com.android.gifts.bottomnavigation.eventtime_view;
import com.android.gifts.bottomnavigation.info_view;
import com.android.gifts.bottomnavigation.new_view;
import com.android.gifts.bottomnavigation.pl_view;
import com.android.gifts.bottomnavigation.rule_view;
import com.android.gifts.bottomnavigation.sd_view;
import com.android.gifts.bottomnavigation.timetable_view;


public class newsfrag extends Fragment {

    public newsfrag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    WebView browser;
    String url = "http://samaggisamagom.org/samaggi-games-2017-2/samaggi-games-news/";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragfixweb_view, container, false);
        browser = (WebView) v.findViewById(R.id.webview1);
        browser.loadUrl(url);

        // Enable Javascript
        WebSettings webSettings = browser.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        browser.setWebViewClient(new WebViewClient());


        return v;
    }
}
