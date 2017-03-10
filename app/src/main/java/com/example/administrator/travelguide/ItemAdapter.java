package com.example.administrator.travelguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class ItemAdapter extends ArrayAdapter<Item> {

    private int mPhoneCallViewId;



    public ItemAdapter(Activity context, ArrayList<Item> words, int phoneCallViewId) {
        super(context, 0, words);
        mPhoneCallViewId = phoneCallViewId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Item currentItem = getItem(position);

        ImageView imageView = (ImageView) listView.findViewById(R.id.list_image);
        imageView.setImageResource(currentItem.getmImageRes());

        TextView nameTextView = (TextView) listView.findViewById(R.id.name);
        nameTextView.setText(currentItem.getmName());

        TextView addressTextView = (TextView) listView.findViewById(R.id.address);
        addressTextView.setText(currentItem.getmAddress());

        ImageView phoneCallImage = (ImageView) listView.findViewById(R.id.phone_call);
        if (currentItem.hasImage()) {

            phoneCallImage.setVisibility(View.VISIBLE);
            phoneCallImage.setImageResource(currentItem.getmPhoneCallRes());
        } else {
            phoneCallImage.setVisibility(View.GONE);
        }

        return listView;


    }
}
