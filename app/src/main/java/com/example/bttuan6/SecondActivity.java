package com.example.bttuan6;

import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<ItemModel> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        items = new ArrayList<>();

        items.add(new ItemModel("Data 1" , R.drawable.thumb1, R.drawable.wall1));
        items.add(new ItemModel("Data 2" , R.drawable.thumb2, R.drawable.wall2));
        items.add(new ItemModel("Data 3" , R.drawable.thumb3, R.drawable.wall3));
        items.add(new ItemModel("Data 4" , R.drawable.thumb4, R.drawable.wall4));
        items.add(new ItemModel("Data 5" , R.drawable.thumb5, R.drawable.wall5));
        items.add(new ItemModel("Data 6" , R.drawable.thumb6, R.drawable.wall6));
        items.add(new ItemModel("Data 7" , R.drawable.thumb7, R.drawable.wall7));
        items.add(new ItemModel("Data 8" , R.drawable.thumb8, R.drawable.wall8));
        items.add(new ItemModel("Data 9" , R.drawable.thumb9, R.drawable.wall9));
        items.add(new ItemModel("Data 10" , R.drawable.thumb10, R.drawable.wall10));
        items.add(new ItemModel("Data 11" , R.drawable.thumb11, R.drawable.wall11));
        items.add(new ItemModel("Data 12" , R.drawable.thumb12, R.drawable.wall12));
        items.add(new ItemModel("Data 13" , R.drawable.thumb13, R.drawable.wall13));

        ImageAdapter adapter = new ImageAdapter(items, this);
        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);

    }
}
