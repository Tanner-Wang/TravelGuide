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

public class AttractionActivity extends AppCompatActivity {

    private AttractionItemAdapter aAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        ImageView attractionImage = (ImageView) findViewById(R.id.top_picture);
        attractionImage.setImageResource(R.drawable.attraction);

        ArrayList<Item> items = new ArrayList<Item>();
        aAdapter = new AttractionItemAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(aAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
                Item currentItem = aAdapter.getItem(position);
                String webLink = getResources().getString(currentItem.getmWebLinkId());
                openAttractionWebPage(webLink);
            }
        });
        items.add(new Item(R.mipmap.windowoftheworld, R.string.attraction_window_of_the_world_name,
                R.string.attraction_window_of_the_world_evaluation, R.string.attraction_window_of_the_world_amount,
                R.string.attraction_window_of_the_world_location, R.string.attraction_window_of_the_world_price, R.string.attraction_window_of_the_world_webLink));
        items.add(new Item(R.mipmap.dameisha, R.string.attraction_da_mei_sha_name, R.string.attraction_da_mei_sha_evaluation,
                R.string.attraction_da_mei_sha_amount, R.string.attraction_da_mei_sha_location,
                R.string.attraction_da_mei_sha_price, R.string.attraction_da_mei_sha_webLink));
        items.add(new Item(R.mipmap.huanlegu, R.string.attraction_huan_le_gu_name, R.string.attraction_huan_le_gu_evaluation,
                R.string.attraction_huan_le_gu_amount, R.string.attraction_huan_le_gu_location,
                R.string.attraction_huan_le_gu_price, R.string.attraction_huan_le_gu_webLink));
        items.add(new Item(R.mipmap.huaqiaocheng, R.string.attraction_hua_qiao_cheng_name, R.string.attraction_hua_qiao_cheng_evaluation,
                R.string.attraction_hua_qiao_cheng_amount, R.string.attraction_hua_qiao_cheng_location,
                R.string.attraction_hua_qiao_cheng_price, R.string.attraction_hua_qiao_cheng_webLink));
        items.add(new Item(R.mipmap.xichon, R.string.attraction_xi_chon_name, R.string.attraction_xi_chon_evaluation,
                R.string.attraction_xi_chon_amount, R.string.attraction_xi_chon_location,
                R.string.attraction_xi_chon_price, R.string.attraction_xi_chon_webLink));
        items.add(new Item(R.mipmap.lianhuashan, R.string.attraction_lian_hua_shan_name, R.string.attraction_lian_hua_shan_evaluation,
                R.string.attraction_lian_hua_shan_amount, R.string.attraction_lian_hua_shan_location,
                R.string.attraction_lian_hua_shan_price, R.string.attraction_lian_hua_shan_webLink));
        items.add(new Item(R.mipmap.shenda, R.string.attraction_shen_da_name, R.string.attraction_shen_da_evaluation,
                R.string.attraction_shen_da_amount, R.string.attraction_shen_da_location,
                R.string.attraction_shen_da_price, R.string.attraction_shen_da_webLink));




    }
    private void openAttractionWebPage(String url) {
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
