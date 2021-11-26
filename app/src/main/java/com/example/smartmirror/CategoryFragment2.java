package com.example.smartmirror;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class CategoryFragment2 extends Fragment {

    ListView categoryList;
    ListItem listItem;
    ListAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_category2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        categoryList = view.findViewById(R.id.categoryList);
        listItem = new ListItem();
        adapter = new ListAdapter(getContext());
        Drawable pic1 = getResources().getDrawable(R.drawable.img1);
        Drawable pic2 = getResources().getDrawable(R.drawable.img2);
        Drawable pic3 = getResources().getDrawable(R.drawable.img3);
        Drawable pic4 = getResources().getDrawable(R.drawable.img4);
        Drawable pic5 = getResources().getDrawable(R.drawable.img5);

        adapter.addItem(pic1, "https://www.youtube.com/watch?v=InZ_XAs0-nM");
        adapter.addItem(pic2,"https://www.youtube.com/watch?v=rod11dE9JaA");
        adapter.addItem(pic3, "https://www.youtube.com/watch?v=Q-iEfzaikBI");
        adapter.addItem(pic4, "https://www.youtube.com/watch?v=GA9GigGuf24");
        adapter.addItem(pic5, "https://www.youtube.com/watch?v=y5paOQU66hg");

        categoryList.setAdapter(adapter);


    }
}
