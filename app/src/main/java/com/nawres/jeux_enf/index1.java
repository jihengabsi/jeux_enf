package com.nawres.jeux_enf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.nawres.jeux_enf.colors.LevelsColors;
import com.nawres.jeux_enf.shapes.LevelsShapes;

public class index1 extends AppCompatActivity {

    final String EXTRA_Name = "kids_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.index);


        Intent intent = getIntent();
        TextView Kids = findViewById(R.id.enfant_name);


        if (intent != null) {
            Kids.setText(intent.getStringExtra(EXTRA_Name));


        }


    }


    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), Main2Activity.class));

    }

    public void animal(View view) {
        startActivity(new Intent(getApplicationContext(), animal_level.class));

    }

    public void numbers(View view) {
        startActivity(new Intent(getApplicationContext(), levels_numbers.class));

    }

    public void colors(View view) {
        startActivity(new Intent(getApplicationContext(), LevelsColors.class));

    }

    public void shapes(View view) {
        startActivity(new Intent(getApplicationContext(), LevelsShapes.class));

    }


}