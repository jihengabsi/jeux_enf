package com.nawres.jeux_enf;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;


public class animal_level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_level);

        LinearLayout ll = findViewById(R.id.layout1);
        AnimationDrawable animated = (AnimationDrawable) ll.getBackground();
        animated.setEnterFadeDuration(2000);
        animated.setExitFadeDuration(4000);
        animated.start();


    }

    public void home(View view) {
        startActivity(new Intent(getApplicationContext(), index1.class));

    }

    public void animal_1(View view) {
        startActivity(new Intent(getApplicationContext(), animals.class));

    }

    public void animal_2(View view) {
        startActivity(new Intent(getApplicationContext(), animals2.class));

    }

    public void animal_3(View view) {
        startActivity(new Intent(getApplicationContext(), animals3.class));

    }

    public void animal_4(View view) {
        startActivity(new Intent(getApplicationContext(), animal4.class));

    }

    public void animal_5(View view) {
        startActivity(new Intent(getApplicationContext(), animals5.class));

    }


    public void animal_6(View view) {
        startActivity(new Intent(getApplicationContext(), animals6.class));

    }

    public void animal_7(View view) {
        startActivity(new Intent(getApplicationContext(), animals7.class));

    }

    public void animal_8(View view) {
        startActivity(new Intent(getApplicationContext(), animals8.class));

    }

    public void animal_9(View view) {
        startActivity(new Intent(getApplicationContext(), animals9.class));

    }


}
