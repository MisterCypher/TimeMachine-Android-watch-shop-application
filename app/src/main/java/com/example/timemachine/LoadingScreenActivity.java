package com.example.timemachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LoadingScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        Handler handler =new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
startActivity(new Intent(LoadingScreenActivity.this,RegisterActivity.class));
finish();
                    }
                },4000);
    }
}