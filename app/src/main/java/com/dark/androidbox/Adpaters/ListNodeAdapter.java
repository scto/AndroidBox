package com.dark.androidbox.Adpaters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dark.androidbox.R;
import com.dark.androidbox.StartUp.Actions;
import com.dark.androidbox.Utilities.DarkUtilities;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;

import java.util.ArrayList;

public class ListNodeAdapter extends BaseAdapter {

    public ArrayList<String> mData;

    public ListNodeAdapter(ArrayList<String> data) {
        mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_node, parent, false);
        }

        MaterialCardView color_node_shade = convertView.findViewById(R.id.color_node_shade);

        color_node_shade.setCardBackgroundColor(Color.parseColor("#FFF65FFF"));
        color_node_shade.setRadius(12);

        return convertView;
    }

}


