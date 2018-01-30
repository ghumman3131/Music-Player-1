package com.inception.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SongList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);
    }


    public void song1(View v)
    {

        // creating intent object
        Intent i = new Intent(SongList.this ,PlayerActivity.class);

        // passing value to intent
        i.putExtra("from" , "song1");

        // passing intent object to start Activity function
        startActivity(i);
    }


    public void song2(View v)
    {
        Intent i = new Intent(SongList.this ,PlayerActivity.class);

        i.putExtra("from" , "song2");

        startActivity(i);

    }

}
