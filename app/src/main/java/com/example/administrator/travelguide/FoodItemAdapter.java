package com.example.administrator.travelguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/5/7.
 */

public class FoodItemAdapter extends ArrayAdapter<Item> {

    private ViewHolder holder = new ViewHolder();
    public FoodItemAdapter(Activity context, ArrayList<Item> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.food_list_item, parent, false);
        }

        final Item currentItem = getItem(position);

        holder.imageView = (ImageView) listView.findViewById(R.id.food_list_image);
        holder.imageView.setImageResource(currentItem.getmImageRes());

        holder.nameTextView = (TextView) listView.findViewById(R.id.food_name);
        holder.nameTextView.setText(currentItem.getmName());

        holder.levelTextView = (TextView) listView.findViewById(R.id.food_level);
        holder.levelTextView.setText(currentItem.getmLevelId());

        holder.locationTextView = (TextView) listView.findViewById(R.id.food_location);
        holder.locationTextView.setText(currentItem.getmLocationId());

        holder.kindTextView = (TextView) listView.findViewById(R.id.food_kind);
        holder.kindTextView.setText(currentItem.getmKindId());

        holder.featuresTextView = (TextView) listView.findViewById(R.id.food_features);
        holder.featuresTextView.setText(currentItem.getmFeaturesId());

        holder.priceTextView = (TextView) listView.findViewById(R.id.food_price);
        holder.priceTextView.setText(currentItem.getmPriceId());

        return listView;


    }

    private class ViewHolder {
        public ViewHolder() {
        }

        ImageView imageView;
        TextView nameTextView;
        TextView kindTextView;
        TextView levelTextView;
        TextView locationTextView;
        TextView featuresTextView;
        TextView priceTextView;
    }
}
