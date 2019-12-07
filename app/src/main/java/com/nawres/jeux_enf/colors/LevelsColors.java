package com.nawres.jeux_enf.colors;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.nawres.jeux_enf.R;


public class LevelsColors extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels_colors);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), Level1Colors.class);
                startActivity(l);


            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), Level2Colors.class);
                startActivity(l);


            }

        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), Level3Colors.class);
                startActivity(l);


            }

        });

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), Level4Colors.class);
                startActivity(l);


            }

        });

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), Level5Colors.class);
                startActivity(l);


            }

        });
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), Level6Colors.class);
                startActivity(l);


            }

        });
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), Level7Colors.class);
                startActivity(l);


            }

        });
        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), Level8Colors.class);
                startActivity(l);


            }

        });
        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), Level9Colors.class);
                startActivity(l);


            }

        });
    }
}
