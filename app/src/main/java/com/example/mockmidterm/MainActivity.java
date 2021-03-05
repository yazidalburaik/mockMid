package com.example.mockmidterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mpKittenSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finalizing all objects used.
        final ImageView kitten =  (ImageView) findViewById(R.id.imageView);
        final Button A1toA2 = (Button) findViewById(R.id.bttn_1to2);
        final Button A1toA3 = (Button) findViewById(R.id.bttn_1to3);

        //Creating audio on image click

        //Media Player (MP)
        mpKittenSong =  MediaPlayer.create(this,R.raw.meowsound);



        //Audio OnclickListener (simple put Mediaplayer name then .start()
        kitten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpKittenSong.start();
            }
        });

        //Button to second screen
        A1toA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 Intent intent1 = new Intent(MainActivity.this, Activity2.class);
 startActivity(intent1);
            }
        });

        //Button to Third Screen

        A1toA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Activity3.class);
                startActivity(intent2);
            }
        });





    }
}