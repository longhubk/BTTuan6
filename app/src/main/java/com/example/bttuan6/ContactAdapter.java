package com.example.bttuan6;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;




    public class ContactAdapter extends BaseAdapter {

        List<ContactModel> contacts;

        public ContactAdapter(List<ContactModel> contacts) {
            this.contacts = contacts;
        }
        private String RanC(char c){
            Random random = new Random();

            // create a big random number - maximum is ffffff (hex) = 16777215 (dez)
            int num = c;
            int nextInt = num + c*101005 + c*9921 - (c*2)*23 ;

            // format it as hexadecimal string (with hashtag and leading zeros)
            String colorCode = String.format("#%06x", nextInt);
            System.out.println(colorCode);

            return  colorCode;
        }

        @Override
        public int getCount() {
            return contacts.size();
        }

        @Override
        public Object getItem(int position) {
            return contacts.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            ViewHolder viewHolder;
            if (convertView == null) {

                convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_3, parent, false);
                viewHolder = new ViewHolder();
                viewHolder.textfullname = convertView.findViewById(R.id.text_fullname);
                viewHolder.subname = convertView.findViewById(R.id.sub_name);
                viewHolder.time = convertView.findViewById(R.id.text_time);
                viewHolder.textRound = convertView.findViewById(R.id.text_round);
                viewHolder.imageFavorite = convertView.findViewById(R.id.image_favorite);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
//        ImageView imageAvatar = convertView.findViewById(R.id.image_avatar);
//        TextView textfullname = convertView.findViewById(R.id.text_fullname);
//        CheckBox chkSelected = convertView.findViewById(R.id.chk_select);

            final ContactModel contact = contacts.get(position);
            viewHolder.textfullname.setText(contact.getFullname());
            viewHolder.subname.setText(contact.getSubname());
            viewHolder.time.setText(contact.getTime());

            char c = (char) viewHolder.textfullname.getText().charAt(0);
            String color = this.RanC(c);

            viewHolder.textRound.getBackground().setColorFilter(Color.parseColor(color), PorterDuff.Mode.MULTIPLY);
            viewHolder.textRound.setText(contact.getFullname().substring(0, 1).toUpperCase());
            if (contact.isSlected)
                viewHolder.imageFavorite.setImageResource(R.drawable.ic_star_favourite);
            else
                viewHolder.imageFavorite.setImageResource(R.drawable.ic_star_none_favourite);


            viewHolder.imageFavorite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Boolean isSelected = contacts.get(position).isSlected;
                    contacts.get(position).setSlected(!isSelected);
                    notifyDataSetChanged();
                }
            });

            return convertView;
        }

        class ViewHolder {
            ImageView imageAvatar;
            TextView textfullname;
            TextView subname;
            TextView time;
            TextView textRound;
            ImageView imageFavorite;

        }
    }

