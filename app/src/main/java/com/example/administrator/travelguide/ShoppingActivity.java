package com.example.administrator.travelguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        TextView shoppingTitle = (TextView) findViewById(R.id.title);
        shoppingTitle.setText(R.string.shopping);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.mipmap.shopping1, R.string.shopping1, R.string.the_address));
        items.add(new Item(R.mipmap.shopping2, R.string.shopping2, R.string.the_address));
        items.add(new Item(R.mipmap.shopping1, R.string.shopping1, R.string.the_address));
        items.add(new Item(R.mipmap.shopping2, R.string.shopping2, R.string.the_address));
        items.add(new Item(R.mipmap.shopping1, R.string.shopping1, R.string.the_address));
        items.add(new Item(R.mipmap.shopping2, R.string.shopping2, R.string.the_address));
        items.add(new Item(R.mipmap.shopping1, R.string.shopping1, R.string.the_address));
        items.add(new Item(R.mipmap.shopping2, R.string.shopping2, R.string.the_address));
        items.add(new Item(R.mipmap.shopping1, R.string.shopping1, R.string.the_address));
        items.add(new Item(R.mipmap.shopping2, R.string.shopping2, R.string.the_address));
        items.add(new Item(R.mipmap.shopping1, R.string.shopping1, R.string.the_address));
        items.add(new Item(R.mipmap.shopping2, R.string.shopping2, R.string.the_address));

        ItemAdapter adapter = new ItemAdapter(this, items, R.id.phone_call);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
                Toast.makeText(ShoppingActivity.this, "Nothing to show yet.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
