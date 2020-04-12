package com.example.bttuan6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LeftRightContactAdapter extends BaseAdapter {

    List<ContactModel> contacts;

    public LeftRightContactAdapter(List<ContactModel> contacts) {
        this.contacts = contacts;
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

//    @Override
//    public int getItemViewType(int position) {
//        if(contacts.get(position).isLeft == true)
//            return 0;
//        else
//            return 1;
//
//    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
//        ViewHolder viewHolder;
//        if(convertView == null){
//
//            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_2, parent, false);
//            viewHolder = new ViewHolder();
//            viewHolder.textfullname = convertView.findViewById(R.id.text_fullname);
//            viewHolder.imageAvatar = convertView.findViewById(R.id.image_avatar);
//            viewHolder.chkSelected = convertView.findViewById(R.id.chk_select);
//            convertView.setTag(viewHolder);
//        }else{
//            viewHolder = (ViewHolder)convertView.getTag();
//        }

        if(getItemViewType(position) == 0 ){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_left, parent, false);
        }else
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_right, parent, false);

        ImageView imageAvatar = convertView.findViewById(R.id.image_avatar);
        TextView textfullname = convertView.findViewById(R.id.text_fullname);
//        CheckBox chkSelected = convertView.findViewById(R.id.chk_select);

        final ContactModel contact = contacts.get(position);
//        imageAvatar.setImageResource(contact.getAvatarRes());
        textfullname.setText(contact.getFullname());
//        chkSelected.setChecked(contact.isSlected);

//        viewHolder.imageAvatar.setImageResource(contact.getAvatarRes());
//        viewHolder.textfullname.setText(contact.getFullname());
//        viewHolder.chkSelected.setChecked(contact.isSlected);
//
//        viewHolder.chkSelected.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Boolean isSelected = contacts.get(position).isSlected;
//                contacts.get(position).setSlected(!isSelected);
//                notifyDataSetChanged();
//            }
//        });

        return convertView;
    }

    class ViewHolder{
        ImageView imageAvatar ;
        TextView textfullname ;
        CheckBox chkSelected ;

    }
}
