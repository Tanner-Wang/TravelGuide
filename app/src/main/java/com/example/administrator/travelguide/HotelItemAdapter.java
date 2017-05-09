package com.example.administrator.travelguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class HotelItemAdapter extends ArrayAdapter<Item> {

    ViewHolder holder;

    public HotelItemAdapter(Activity context, ArrayList<Item> words) {
        super(context, 0, words);
        holder = new ViewHolder();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.hotel_list_item, parent, false);
        }

        final Item currentItem = getItem(position);

        holder.imageView = (ImageView) listView.findViewById(R.id.hotel_list_image);
        holder.imageView.setImageResource(currentItem.getmImageRes());

        holder.nameTextView = (TextView) listView.findViewById(R.id.hotel_name);
        holder.nameTextView.setText(currentItem.getmName());

        holder.scoreTextView = (TextView) listView.findViewById(R.id.hotel_score);
        holder.scoreTextView.setText(currentItem.getmScoreId());

        holder.evaluationTextView = (TextView) listView.findViewById(R.id.hotel_evaluation);
        holder.evaluationTextView.setText(currentItem.getmEvaluationId());

        holder.levelTextView = (TextView) listView.findViewById(R.id.hotel_level);
        holder.levelTextView.setText(currentItem.getmLevelId());

        holder.locationTextView = (TextView) listView.findViewById(R.id.hotel_location);
        holder.locationTextView.setText(currentItem.getmLocationId());

        holder.featuresTextView = (TextView) listView.findViewById(R.id.hotel_features);
        holder.featuresTextView.setText(currentItem.getmFeaturesId());

        holder.priceTextView = (TextView) listView.findViewById(R.id.hotel_price);
        holder.priceTextView.setText(currentItem.getmPriceId());

        return listView;


    }

    private class ViewHolder {
        public ViewHolder() {
        }

        ImageView imageView;
        TextView nameTextView;
        TextView scoreTextView;
        TextView evaluationTextView;
        TextView levelTextView;
        TextView locationTextView;
        TextView featuresTextView;
        TextView priceTextView;
    }
}
