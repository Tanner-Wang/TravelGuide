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

public class HotelActivity extends AppCompatActivity {

    private HotelItemAdapter hAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        ImageView hotelImage = (ImageView) findViewById(R.id.top_picture);
        hotelImage.setImageResource(R.drawable.hotel);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.mipmap.zhongnanhaiyi, R.string.hotel_zhong_nan_hai_yi_name,
                R.string.hotel_zhong_nan_hai_yi_score,R.string.hotel_zhong_nan_hai_yi_evaluation,
                R.string.hotel_zhong_nan_hai_yi_level,R.string.hotel_zhong_nan_hai_yi_location,
                R.string.hotel_zhong_nan_hai_yi_features,R.string.hotel_zhong_nan_hai_yi_price,
                R.string.hotel_zhong_nan_hai_yi_webLink));
        items.add(new Item(R.mipmap.bogao, R.string.hotel_bo_gao_name, R.string.hotel_bo_gao_score,
                R.string.hotel_bo_gao_evaluation, R.string.hotel_bo_gao_level, R.string.hotel_bo_gao_location,
                R.string.hotel_bo_gao_features, R.string.hotel_bo_gao_price, R.string.hotel_bo_gao_webLink));
        items.add(new Item(R.mipmap.binheshidai, R.string.hotel_bin_he_shi_dai_name, R.string.hotel_bin_he_shi_dai_score,
                R.string.hotel_bin_he_shi_dai_evaluation, R.string.hotel_bin_he_shi_dai_level,
                R.string.hotel_bin_he_shi_dai_location, R.string.hotel_bin_he_shi_dai_features,
                R.string.hotel_bin_he_shi_dai_price, R.string.hotel_bin_he_shi_dai_webLink));
        items.add(new Item(R.mipmap.juzijiudian, R.string.hotel_ju_zi_jiu_dian_name, R.string.hotel_ju_zi_jiu_dian_score,
                R.string.hotel_ju_zi_jiu_dian_evaluation, R.string.hotel_ju_zi_jiu_dian_level, R.string.hotel_ju_zi_jiu_dian_location,
                R.string.hotel_ju_zi_jiu_dian_features, R.string.hotel_ju_zi_jiu_dian_price, R.string.hotel_ju_zi_jiu_dian_webLink));

        items.add(new Item(R.mipmap.yaduo, R.string.hotel_ya_duo_name, R.string.hotel_ya_duo_score,
                R.string.hotel_ya_duo_evaluation, R.string.hotel_ya_duo_level, R.string.hotel_ya_duo_location,
                R.string.hotel_ya_duo_features, R.string.hotel_ya_duo_price, R.string.hotel_ya_duo_webLink));
        items.add(new Item(R.mipmap.chutian, R.string.hotel_chu_tian_name, R.string.hotel_chu_tian_score,
                R.string.hotel_chu_tian_evaluation, R.string.hotel_chu_tian_level, R.string.hotel_chu_tian_location,
                R.string.hotel_chu_tian_features, R.string.hotel_chu_tian_price, R.string.hotel_chu_tian_webLink));
        items.add(new Item(R.mipmap.baihe, R.string.hotel_bai_he_name, R.string.hotel_bai_he_score,
                R.string.hotel_bai_he_evaluation, R.string.hotel_bai_he_level, R.string.hotel_bai_he_location,
                R.string.hotel_bai_he_features, R.string.hotel_bai_he_price, R.string.hotel_bai_he_webLink));

        hAdapter = new HotelItemAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(hAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
                Item currentItem = hAdapter.getItem(position);
                String webLink = getResources().getString(currentItem.getmWebLinkId());
                openHotelWebPage(webLink);
            }
        });

    }
    private void openHotelWebPage(String url) {
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
