package com.fc.webview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;


public class JoinGroupQQActivity extends Activity {

    private WebView webView;
    public static final String JOIN_GROUP_QQ_URL = "joinGroupQQUrl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_group_qq);
        webView = (WebView) findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        Intent intent = getIntent();
        webView.loadUrl(intent.getStringExtra(JOIN_GROUP_QQ_URL));
    }
}
