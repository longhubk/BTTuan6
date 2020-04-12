package com.example.bttuan6;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ItemModel> items;
    ImageView imageLarge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageLarge = findViewById(R.id.image_large);
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

        // get main layout
        LinearLayout layoutList = findViewById(R.id.layout_list);

        // for each item obj of item model -> take id and assign to item layout
        for (int i = 0; i < items.size(); i++) {
            Log.v("TAG", "click" + i);
            View itemView = getLayoutInflater().inflate(R.layout.layout_item, null);
            itemView.setId(i);
            ImageView imageView = itemView.findViewById(R.id.image_view);
            TextView textView = itemView.findViewById(R.id.text_view);
            textView.setText(items.get(i).getLabel());
            imageView.setImageResource(items.get(i).getThumbnailRes());



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int i = view.getId();
                    Log.v("TAG", "error "+ i);
                    int imageRes = items.get(i).getImageRes();
                    imageLarge.setImageResource(imageRes);
                }
            });

            layoutList.addView(itemView);
        }
    }
}
