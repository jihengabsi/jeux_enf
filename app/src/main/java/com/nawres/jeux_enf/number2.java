package com.nawres.jeux_enf;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class number2 extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Button menu;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number2);

        LinearLayout ll = findViewById(R.id.layout);
        AnimationDrawable animated = (AnimationDrawable) ll.getBackground();

        animated.setEnterFadeDuration(2000);
        animated.setExitFadeDuration(4000);
        animated.start();


        menu = findViewById(R.id.btn_menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), menu);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {

                            case R.id.home:
                                Intent i = new Intent(getApplicationContext(), index1.class);
                                startActivity(i);
                                return true;


                            case R.id.level_number:
                                Intent l = new Intent(getApplicationContext(), levels_numbers.class);
                                startActivity(l);
                                return true;


                        }

                        return false;
                    }
                });
                popupMenu.show();

            }
        });


    }


    public void play(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.number_2);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }

    public void pause(View view) {
        if (player != null) {
            player.pause();
        }
    }

    public void stop(View view) {
        stopPlayer();
    }

    private void stopPlayer() {
        if (player != null) {
            player.release();
            player = null;
            Toast.makeText(this, "MediaPlayer released", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }


    public void preced(View view) {
        startActivity(new Intent(getApplicationContext(), number1.class));


    }


    public void next(View view) {
        startActivity(new Intent(getApplicationContext(), number3.class));

    }


}

