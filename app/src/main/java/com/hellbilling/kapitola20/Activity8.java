package com.hellbilling.kapitola20;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class Activity8 extends ListActivity {
    TextView selection;
    String[] items;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_activity7);
        selection=(TextView)findViewById(R.id.selection);

        // Nacitame polozky pola z array.xml ale ako resourece nie ako xml
        // Trieda Resources sa vola cez getResources, nasledujuce dva riadky robia to co riadok pod nimi ale hore este musi byt import android.content.res.Resources;
        //Resources res = getResources();
        //items = res.getStringArray(R.array.polozky);
        items = getResources().getStringArray(R.array.polozky);


        setListAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                items));
    }

    public void onListItemClick(ListView parent, View v, int position,long id) {
        //selection.setText(items.get(position).toString());
        selection.setText(items[position]);
    }
}