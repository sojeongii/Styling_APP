package com.example.smartmirror;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;


public class CategoryFragment extends Fragment {

    ListView categoryList;
    ListItem listItem;
    ListAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_category, container, false);
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

        Button button1 = view.findViewById(R.id.btn_formal);
        Button button2 = view.findViewById(R.id.btn_formal);
        Button button3 = view.findViewById(R.id.btn_casual);
        Button button4 = view.findViewById(R.id.btn_street);
        Button button5 = view.findViewById(R.id.btn_chic);
        Button button6 = view.findViewById(R.id.btn_sport);
        Button button7 = view.findViewById(R.id.btn_romantic);
        Button button8 = view.findViewById(R.id.btn_girlish);

        //////////////////////////////////////////
        // 버튼 클릭 시 리스트뷰 바꾸기
        //////////////////////////////////////////
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}