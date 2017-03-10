package com.example.administrator.travelguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.mipmap.hotel1,R.string.hotel1,R.string.the_address,R.mipmap.phone_call));
        items.add(new Item(R.mipmap.hotel2,R.string.hotel2,R.string.the_address,R.mipmap.phone_call));

        ItemAdapter adapter = new ItemAdapter(this,items,R.id.phone_call);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
