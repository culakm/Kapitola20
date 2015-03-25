package com.hellbilling.kapitola20;


import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class Activity7 extends ListActivity {
    TextView selection;
    ArrayList<String> items=new ArrayList<>();

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_activity7);
        selection=(TextView)findViewById(R.id.selection);

        try {
            XmlPullParser xpp=getResources().getXml(R.xml.words);

            while (xpp.getEventType()!=XmlPullParser.END_DOCUMENT) {
                if (xpp.getEventType()==XmlPullParser.START_TAG) {
                    if (xpp.getName().equals("word")) {
                        items.add(xpp.getAttributeValue(0));
                    }
                }

                xpp.next();
            }
        }
        catch (Throwable t) {
            Toast
                    .makeText(this, "Request failed: "+t.toString(), Toast.LENGTH_LONG)
                    .show();
        }

        setListAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                items));
    }

    public void onListItemClick(ListView parent, View v, int position,
                                long id) {
        // toto tu bolo povodne ale vypisuje ze to je redundantne
        //selection.setText(items.get(position).toString());
        selection.setText(items.get(position));
    }
}