package com.example.jacksondidat.memesoundboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.media.MediaPlayer;

public class MainSoundboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_soundboard);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.seinfeld_bass);

        Button seinfeld = (Button) findViewById(R.id.seinfeld);
        seinfeld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(mp.isPlaying());
                if (mp.isPlaying()) {
                    System.out.println("stop");
                    mp.pause();
                    mp.seekTo(0);
                }
                else {
                    mp.start();
                    System.out.println("play");
                }
            }
        });

        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.to_be_continued);

        Button toBeContinued = (Button) findViewById(R.id.yes);
        toBeContinued.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(mp1.isPlaying());
                if (mp1.isPlaying()) {
                    System.out.println("stop");
                    mp1.pause();
                    mp1.seekTo(0);
                }
                else {
                    mp1.start();
                    System.out.println("play");
                }
            }
        });

        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.ya_like_jazz);

        Button yaLikeJazz = (Button) findViewById(R.id.jazz);
        yaLikeJazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(mp2.isPlaying());
                if (mp2.isPlaying()) {
                    System.out.println("stop");
                    mp2.pause();
                    mp2.seekTo(0);
                }
                else {
                    mp2.start();
                    System.out.println("play");
                }
            }
        });

    }
}

