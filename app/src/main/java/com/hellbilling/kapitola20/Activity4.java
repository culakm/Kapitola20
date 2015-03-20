package com.hellbilling.kapitola20;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity4 extends Activity {
    private EditText lat;
    private EditText lon;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_activity4);

        lat=(EditText)findViewById(R.id.lat);
        lon=(EditText)findViewById(R.id.lon);
    }

    public void showMe(View v) {
        String _lat=lat.getText().toString();
        String _lon=lon.getText().toString();
        Uri uri=Uri.parse("geo:"+_lat+","+_lon);

        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}