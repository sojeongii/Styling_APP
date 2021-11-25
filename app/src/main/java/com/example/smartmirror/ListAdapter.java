package com.example.smartmirror;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ListItem> listItems = new ArrayList<ListItem>();


    public ListAdapter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int i) {
        return listItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_styling, parent, false);
        }


        ListItem listItem = listItems.get(position);
//        final TextView titleTextView = (TextView) convertView.findViewById(R.id.stylingTitle);

        ImageButton doneCheck = (ImageButton) convertView.findViewById(R.id.stylingLink);
        doneCheck.setImageDrawable(listItem.getImage());
        doneCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(listItem.getLink()));
                context.startActivity(intent);
            }
        });

        return convertView;
    }

    public void addItem(Drawable image, String Link){
        ListItem listItem = new ListItem();

        listItem.setImage(image);
        listItem.setLink(Link);
        listItems.add(listItem);
    }

    public void removeItem(int pos){
        listItems.remove(pos);
        notifyDataSetChanged();
    }
}
