package com.example.administrator.travelguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    private ShoppingItemAdapter sAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        ImageView shoppingImage = (ImageView) findViewById(R.id.top_picture);
        shoppingImage.setImageResource(R.drawable.shopping_mall);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.mipmap.eastgate, R.string.shopping_east_gate_pedestrian_street_name,
                R.string.shopping_east_gate_pedestrian_street_evaluation, R.string.shopping_east_gate_pedestrian_street_location,
                R.string.shopping_east_gate_pedestrian_street_webLink));

        items.add(new Item(R.mipmap.huaqiangbei, R.string.shopping_hua_qiang_bei_name, R.string.shopping_hua_qiang_bei_evaluation,
                R.string.shopping_hua_qiang_bei_location, R.string.shopping_hua_qiang_bei_webLink));

        items.add(new Item(R.mipmap.wanxiangcheng, R.string.shopping_wan_xiang_cheng_name, R.string.shopping_wan_xiang_cheng_evaluation,
                R.string.shopping_wan_xiang_cheng_location, R.string.shopping_wan_xiang_cheng_webLink));
        items.add(new Item(R.mipmap.jingjibaina, R.string.shopping_jing_ji_name, R.string.shopping_jing_ji_evaluation,
                R.string.shopping_jing_ji_location, R.string.shopping_jing_ji_webLink));

        items.add(new Item(R.mipmap.haiancheng, R.string.shopping_hai_an_cheng_name, R.string.shopping_hai_an_cheng_evaluation,
                R.string.shopping_hai_an_cheng_location, R.string.shopping_hai_an_cheng_webLink));

        items.add(new Item(R.mipmap.yitian, R.string.shopping_yi_tian_name, R.string.shopping_yi_tian_evaluation,
                R.string.shopping_yi_tian_location, R.string.shopping_yi_tian_webLink));

        items.add(new Item(R.mipmap.cocopark, R.string.shopping_cocopark_name, R.string.shopping_cocopark_evaluation,
                R.string.shopping_cocopark_location, R.string.shopping_cocopark_webLink));

        sAdapter = new ShoppingItemAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(sAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
                Item currentItem = sAdapter.getItem(position);
                String webLink = getResources().getString(currentItem.getmWebLinkId());
                openShoppingWebPage(webLink);
            }
        });
    }
    private void openShoppingWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
