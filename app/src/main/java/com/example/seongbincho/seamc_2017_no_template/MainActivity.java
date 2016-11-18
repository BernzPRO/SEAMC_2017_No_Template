package com.example.seongbincho.seamc_2017_no_template;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;





import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ImageButton myImageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageButton = (ImageButton) findViewById(R.id.imageButton1);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(MainActivity.this,schedule.class);
                startActivity(intentLoadActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton4);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(MainActivity.this, map.class);
                startActivity(intentLoadActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton7);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(MainActivity.this, socialmedia.class);
                startActivity(intentLoadActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton3);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(MainActivity.this, news.class);
                startActivity(intentLoadActivity);
            }
        });


        myImageButton = (ImageButton) findViewById(R.id.imageButton5);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(MainActivity.this, contact_info.class);
                startActivity(intentLoadActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton6);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(MainActivity.this, emergency.class);
                startActivity(intentLoadActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton8);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(MainActivity.this, leaderboard.class);
                startActivity(intentLoadActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton2);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(MainActivity.this, gallery.class);
                startActivity(intentLoadActivity);
            }
        });



    }


    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Quit Application? ");
        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();


            }
        });
        builder.setPositiveButton("Quit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();

            }


        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }









}
