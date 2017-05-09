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

public class AttractionItemAdapter extends ArrayAdapter<Item> {

    private ViewHolder holder = new ViewHolder();

    public AttractionItemAdapter(Activity context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.attraction_list_item, parent, false);
        }

        final Item currentItem = getItem(position);

        holder.imageView = (ImageView) listView.findViewById(R.id.attraction_list_image);
        holder.imageView.setImageResource(currentItem.getmImageRes());

        holder.nameTextView = (TextView) listView.findViewById(R.id.attraction_name);
        holder.nameTextView.setText(currentItem.getmName());

        holder.evaluationTextView = (TextView) listView.findViewById(R.id.attraction_evaluation);
        holder.evaluationTextView.setText(currentItem.getmEvaluationId());

        holder.amountTextView = (TextView) listView.findViewById(R.id.attraction_amount);
        holder.amountTextView.setText(currentItem.getmAmountId());

        holder.locationTextView = (TextView) listView.findViewById(R.id.attraction_location);
        holder.locationTextView.setText(currentItem.getmLocationId());

        holder.priceTextView = (TextView) listView.findViewById(R.id.attraction_price);
        holder.priceTextView.setText(currentItem.getmPriceId());

        return listView;


    }
    private class ViewHolder {
        public ViewHolder() {
        }

        ImageView imageView;
        TextView nameTextView;
        TextView evaluationTextView;
        TextView amountTextView;
        TextView locationTextView;
        TextView priceTextView;
    }
}
