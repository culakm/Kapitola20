package com.hellbilling.kapitola20;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TabHost;

public class Activity5 extends TabActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TabHost host=getTabHost();
        Intent i=new Intent(this, CWBrowser.class);

        i.putExtra(CWBrowser.URL, "http://commonsware.com");
        host.addTab(host.newTabSpec("one")
                .setIndicator("CW")
                .setContent(i));

        i=new Intent(i);
        i.putExtra(CWBrowser.URL, "http://www.android.com");
        host.addTab(host.newTabSpec("two")
                .setIndicator("Android")
                .setContent(i));
    }
}
