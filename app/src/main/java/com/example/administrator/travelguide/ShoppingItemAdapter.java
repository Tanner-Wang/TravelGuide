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

public class ShoppingItemAdapter extends ArrayAdapter<Item> {

    ViewHolder holder = new ViewHolder();

    public ShoppingItemAdapter(Activity context, ArrayList<Item> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.shopping_list_item, parent, false);
        }

        final Item currentItem = getItem(position);

        holder.imageView = (ImageView) listView.findViewById(R.id.shopping_list_image);
        holder.imageView.setImageResource(currentItem.getmImageRes());

        holder.nameTextView = (TextView) listView.findViewById(R.id.shopping_name);
        holder.nameTextView.setText(currentItem.getmName());

        holder.evaluationTextView = (TextView) listView.findViewById(R.id.shopping_evaluation);
        holder.evaluationTextView.setText(currentItem.getmEvaluationId());

        holder.locationTextView = (TextView) listView.findViewById(R.id.shopping_location);
        holder.locationTextView.setText(currentItem.getmLocationId());

        return listView;


    }
    private class ViewHolder {
        public ViewHolder() {
        }

        ImageView imageView;
        TextView nameTextView;
        TextView evaluationTextView;
        TextView locationTextView;
    }
}
