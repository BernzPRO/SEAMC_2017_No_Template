package com.example.seongbincho.seamc_2017_no_template;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.seongbincho.seamc_2017_no_template.MainActivity;
import com.example.seongbincho.seamc_2017_no_template.R;

/**
 * Created by Bernie on 11/2/16.
 */

public class SplashScreenActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
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
