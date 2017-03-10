package com.example.administrator.travelguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.mipmap.shopping1,R.string.shopping1,R.string.the_address));
        items.add(new Item(R.mipmap.shopping2,R.string.shopping2,R.string.the_address));

        ItemAdapter adapter = new ItemAdapter(this,items,R.id.phone_call);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
