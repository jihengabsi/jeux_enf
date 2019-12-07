package com.nawres.jeux_enf.colors;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.nawres.jeux_enf.R;

public class Level2Colors extends AppCompatActivity {
    private Button btnDisplay;
    private EditText choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_colors);
        addListenerOnButton();
    }

    public void addListenerOnButton() {


        btnDisplay = findViewById(R.id.btnDisplay);
        choice = findViewById(R.id.choice);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (choice.getText().toString().equals("blue")) {
                    Toast.makeText(Level2Colors.this, "True", Toast.LENGTH_SHORT).show();
                    Intent l = new Intent(getApplicationContext(), Level3Colors.class);
                    startActivity(l);

                } else {
                    Toast.makeText(Level2Colors.this,
                            "False", Toast.LENGTH_LONG).show();
                }
            }

        });

    }

    public void help(View view) {
        Intent l = new Intent(getApplicationContext(), cheatSheet1.class);
        startActivity(l);

    }
}
