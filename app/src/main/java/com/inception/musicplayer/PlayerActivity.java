package com.inception.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
    }

    public void playSong(View v)
    {

        // reading value passed by intent
        String value = getIntent().getStringExtra("from");

        // checking the passed value

        if(value.equals("song1")) {

            // creating media player object
            MediaPlayer mp = MediaPlayer.create(PlayerActivity.this, R.raw.piano_song);

            // starting media player
            mp.start();
        }

        else if(value.equals("song2"))
        {
            MediaPlayer mp = MediaPlayer.create(PlayerActivity.this, R.raw.piano_song);

            mp.start();
        }

    }
}
