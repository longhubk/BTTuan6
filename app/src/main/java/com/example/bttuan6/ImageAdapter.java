package com.example.bttuan6;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

public class ImageAdapter extends BaseAdapter {

    List<ItemModel> items;
    Context context;
    int itemWidth;

    public ImageAdapter(List<ItemModel> items, Context context) {

        this.items = items;
        this.context = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int space = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8, displayMetrics);
        itemWidth = (displayMetrics.widthPixels - space)/3;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if(convertView == null){
            imageView = new ImageView(context);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(itemWidth, itemWidth));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);

        }else
            imageView = (ImageView) convertView;

        imageView.setImageResource(items.get(position).getThumbnailRes());
        return imageView;
    }
}
