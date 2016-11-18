package com.example.seongbincho.seamc_2017_no_template;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by seongbincho on 11/17/16.
 */

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3500);
                    Intent startMainActivity =  new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(startMainActivity);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        myThread.start();

    }
}
