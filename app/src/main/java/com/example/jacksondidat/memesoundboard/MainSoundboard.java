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

        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.sax_seal);

        Button saxSeal = (Button) findViewById(R.id.seal);
        saxSeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(mp3.isPlaying());
                if (mp3.isPlaying()) {
                    System.out.println("stop");
                    mp3.pause();
                    mp3.seekTo(0);
                }
                else {
                    mp3.start();
                    System.out.println("play");
                }
            }
        });

        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.rock_lobster);

        Button rockLobster = (Button) findViewById(R.id.lobster);
        rockLobster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(mp4.isPlaying());
                if (mp4.isPlaying()) {
                    System.out.println("stop");
                    mp4.pause();
                    mp4.seekTo(0);
                }
                else {
                    mp4.start();
                    System.out.println("play");
                }
            }
        });

        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.ahhhhh);

        Button ahhhhh = (Button) findViewById(R.id.ah);
        ahhhhh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(mp5.isPlaying());
                if (mp5.isPlaying()) {
                    System.out.println("stop");
                    mp5.pause();
                    mp5.seekTo(0);
                }
                else {
                    mp5.start();
                    System.out.println("play");
                }
            }
        });

        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.my_swamp);

        Button swamp = (Button) findViewById(R.id.swamp);
        swamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(mp6.isPlaying());
                if (mp6.isPlaying()) {
                    System.out.println("stop");
                    mp6.pause();
                    mp6.seekTo(0);
                }
                else {
                    mp6.start();
                    System.out.println("play");
                }
            }
        });

        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.all_star);

        Button allStar = (Button) findViewById(R.id.all_star);
        allStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(mp7.isPlaying());
                if (mp7.isPlaying()) {
                    System.out.println("stop");
                    mp7.pause();
                    mp7.seekTo(0);
                }
                else {
                    mp7.start();
                    System.out.println("play");
                }
            }
        });

        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.epic_sax_guy);

        Button saxGuy = (Button) findViewById(R.id.sax_guy);
        saxGuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(mp8.isPlaying());
                if (mp8.isPlaying()) {
                    System.out.println("stop");
                    mp8.pause();
                    mp8.seekTo(0);
                }
                else {
                    mp8.start();
                    System.out.println("play");
                }
            }
        });

        final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.run);

        Button run = (Button) findViewById(R.id.run);
        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(mp9.isPlaying());
                if (mp9.isPlaying()) {
                    System.out.println("stop");
                    mp9.pause();
                    mp9.seekTo(0);
                }
                else {
                    mp9.start();
                    System.out.println("play");
                }
            }
        });

        final MediaPlayer mp10 = MediaPlayer.create(this, R.raw.wake_me_up);

        Button wake = (Button) findViewById(R.id.wake);
        wake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(mp10.isPlaying());
                if (mp10.isPlaying()) {
                    System.out.println("stop");
                    mp10.pause();
                    mp10.seekTo(0);
                }
                else {
                    mp10.start();
                    System.out.println("play");
                }
            }
        });

        final MediaPlayer mp11 = MediaPlayer.create(this, R.raw.crawling_in_my_skin);

        Button crawling = (Button) findViewById(R.id.crawling);
        crawling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(mp11.isPlaying());
                if (mp11.isPlaying()) {
                    System.out.println("stop");
                    mp11.pause();
                    mp11.seekTo(0);
                }
                else {
                    mp11.start();
                    System.out.println("play");
                }
            }
        });

    }
}

