package com.example.smartmirror;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity implements Button.OnClickListener{

    Button buttonInfo;
    Button buttonStyle;
    Button buttonCloset;
    Button buttonHowTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonInfo = (Button)findViewById(R.id.btn_info);
        buttonInfo.setOnClickListener(this);
        buttonStyle = (Button)findViewById(R.id.btn_styling);
        buttonStyle.setOnClickListener(this);
        buttonCloset = (Button)findViewById(R.id.btn_closet);
        buttonCloset.setOnClickListener(this);
        buttonHowTo = (Button)findViewById(R.id.btn_manual);
        buttonHowTo.setOnClickListener(this);
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_info:
                Intent intent1 = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_styling:
                Intent intent2 = new Intent(MainActivity.this, StylingActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn_closet:
                Intent intent3 = new Intent(MainActivity.this, ClosetActivity.class);
                startActivity(intent3);
                break;
            case R.id.btn_manual:
                Intent intent4 = new Intent(MainActivity.this, ManualActivity.class);
                startActivity(intent4);
                break;

        }
    }
    }