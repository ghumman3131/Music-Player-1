package com.inception.musicplayer;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // referencing imageview from layout file in java class
        ImageView record_image = findViewById(R.id.record_logo);

        // creating animation object and loading animation file from anim directory
        Animation rotate_animation = AnimationUtils.loadAnimation(MainActivity.this ,R.anim.rotate);

        // setting animation to imageview
        record_image.setAnimation(rotate_animation);

        // starting animation
        rotate_animation.start();


        TextView record_label = findViewById(R.id.record_label);

        Animation alpha_animation = AnimationUtils.loadAnimation(MainActivity.this , R.anim.fadein);

        record_label.setAnimation(alpha_animation);

        alpha_animation.start();

        // creating handler object
        Handler h = new Handler();

        // creating runnable object
        Runnable r = new Runnable() {
            @Override
            public void run() {

                /** this code will run after the time mentioned in post delayed function below **/

                // creating intent object
                Intent i = new Intent(MainActivity.this , SongList.class);

                // passing intent object to startActivity function
                startActivity(i);

            }
        };

        // postDelayed function of handler object

        h.postDelayed(r , 9000);


    }
}
