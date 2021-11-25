package com.example.smartmirror;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class StylingActivity extends AppCompatActivity {

    private BottomNavigationView botNav;

    private CategoryFragment fragmentA;
    private ItemFragment fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_styling);

        fragmentA = new CategoryFragment();
        fragmentB = new ItemFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.mainFragment, fragmentA).commitAllowingStateLoss();
        botNav = findViewById(R.id.botNav);

        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (item.getItemId()) {
                    case R.id.nav_category:
                        transaction.replace(R.id.mainFragment, fragmentA).commitAllowingStateLoss();
                        break;
                    case R.id.nav_item:
                        transaction.replace(R.id.mainFragment, fragmentB).commitAllowingStateLoss();
                        break;
                }

                return true;
            }
        });

    }



}