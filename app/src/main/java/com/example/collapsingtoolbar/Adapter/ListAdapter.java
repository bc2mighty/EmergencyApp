package com.example.collapsingtoolbar.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.collapsingtoolbar.R;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Integer> images;
    private ArrayList<String> titles;

    public ListAdapter(Context context, ArrayList<Integer> images, ArrayList<String> titles) {
        this.context = context;
        this.images = images;
        this.titles = titles;
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = View.inflate(context, R.layout.item_list, null);
        }

        ImageView image = (ImageView) convertView.findViewById(R.id.imageView);
        TextView title = (TextView) convertView.findViewById(R.id.textViewTitle);

        image.setImageResource(images.get(0));
        title.setText(titles.get(position));
        return convertView;
    }
}
