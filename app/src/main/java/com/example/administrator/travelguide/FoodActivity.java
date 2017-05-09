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

public class FoodActivity extends AppCompatActivity {

    private FoodItemAdapter fAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        ImageView foodImage = (ImageView) findViewById(R.id.top_picture);
        foodImage.setImageResource(R.drawable.food);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.mipmap.shengji, R.string.food_sheng_ji_name, R.string.food_sheng_ji_level,
                R.string.food_sheng_ji_location, R.string.food_sheng_ji_kind, R.string.food_sheng_ji_features, R.string.food_sheng_ji_price,
                R.string.food_sheng_ji_webLink));

        items.add(new Item(R.mipmap.shundelao, R.string.food_shun_de_lao_name, R.string.food_shun_de_lao_level,
                R.string.food_shun_de_lao_location, R.string.food_shun_de_lao_kind, R.string.food_shun_de_lao_features,
                R.string.food_shun_de_lao_price, R.string.food_shun_de_lao_webLink));

        items.add(new Item(R.mipmap.bashu, R.string.food_ba_shu_name, R.string.food_ba_shu_level,
                R.string.food_ba_shu_location, R.string.food_ba_shu_kind, R.string.food_ba_shu_features,
                R.string.food_ba_shu_price, R.string.food_ba_shu_webLink));

        items.add(new Item(R.mipmap.lvcha, R.string.food_lv_cha_name, R.string.food_lv_cha_level,
                R.string.food_lv_cha_location, R.string.food_lv_cha_kind, R.string.food_lv_cha_features,
                R.string.food_lv_cha_price, R.string.food_lv_cha_webLink));

        items.add(new Item(R.mipmap.waipojia, R.string.food_wai_po_jia_name, R.string.food_wai_po_jia_level, R.string.food_wai_po_jia_location,
                R.string.food_wai_po_jia_kind, R.string.food_wai_po_jia_features, R.string.food_wai_po_jia_price,
                R.string.food_wai_po_jia_webLink));

        items.add(new Item(R.mipmap.miusi, R.string.food_miu_si_name, R.string.food_miu_si_level, R.string.food_miu_si_location,
                R.string.food_miu_si_kind, R.string.food_miu_si_features, R.string.food_miu_si_price,
                R.string.food_miu_si_webLink));

        items.add(new Item(R.mipmap.haijixian, R.string.food_hai_ji_xian_name, R.string.food_hai_ji_xian_level,
                R.string.food_hai_ji_xian_location, R.string.food_hai_ji_xian_kind, R.string.food_hai_ji_xian_features,
                R.string.food_hai_ji_xian_price, R.string.food_hai_ji_xian_webLink));

        fAdapter = new FoodItemAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(fAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
                Item currentItem = fAdapter.getItem(position);
                String webLink = getResources().getString(currentItem.getmWebLinkId());
                openFoodWebPage(webLink);
            }
        });
    }
    private void openFoodWebPage(String url) {
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
