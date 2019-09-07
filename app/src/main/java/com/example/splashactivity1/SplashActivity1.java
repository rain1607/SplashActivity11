package com.example.splashactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashactivity1);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity1.this, com.example.splashactivity1.LoginActivity1.class); //ชื่อเคลาส,ชื่อไอดี>หน้าที่เราจะไปก็คือหน้าLogin
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
