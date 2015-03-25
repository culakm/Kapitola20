package com.hellbilling.kapitola20;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity6 extends Activity {
    EditText name;
    TextView result;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_activity6);

        name=(EditText)findViewById(R.id.name);
        result=(TextView)findViewById(R.id.result);
    }

    public void applyFormat(View v) {
        String format=getString(R.string.funky_format);
        String simpleResult=String.format(format,
                TextUtils.htmlEncode(name.getText().toString()));
        result.setText(Html.fromHtml(simpleResult));
    }
}