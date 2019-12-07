package com.nawres.jeux_enf;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class levels_numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels_numbers);

        LinearLayout ll = findViewById(R.id.layout);
        AnimationDrawable animated = (AnimationDrawable) ll.getBackground();
        animated.setEnterFadeDuration(2000);
        animated.setExitFadeDuration(4000);
        animated.start();


    }

    public void home(View view) {
        startActivity(new Intent(getApplicationContext(), index1.class));

    }

    public void number_1(View view) {
        startActivity(new Intent(getApplicationContext(), number1.class));
    }

    public void number_2(View view) {
        startActivity(new Intent(getApplicationContext(), number2.class));

    }

    public void number_3(View view) {
        startActivity(new Intent(getApplicationContext(), number3.class));

    }

    public void number_4(View view) {
        startActivity(new Intent(getApplicationContext(), number4.class));

    }

    public void number_5(View view) {
        startActivity(new Intent(getApplicationContext(), number5.class));

    }


    public void number_6(View view) {
        startActivity(new Intent(getApplicationContext(), number6.class));

    }

    public void number_7(View view) {
        startActivity(new Intent(getApplicationContext(), number7.class));

    }

    public void number_8(View view) {
        startActivity(new Intent(getApplicationContext(), number8.class));

    }

    public void number_9(View view) {
        startActivity(new Intent(getApplicationContext(), number9.class));

    }
}

