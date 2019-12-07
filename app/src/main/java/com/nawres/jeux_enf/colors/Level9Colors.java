package com.nawres.jeux_enf.colors;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.nawres.jeux_enf.R;

public class Level9Colors extends AppCompatActivity {
    private Button btnDisplay;
    private EditText choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level9_colors);
        addListenerOnButton();
    }

    public void addListenerOnButton() {


        btnDisplay = findViewById(R.id.btnDisplay);
        choice = findViewById(R.id.choice);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (choice.getText().toString().equals("magenta")) {
                    Toast.makeText(Level9Colors.this, "True.. Congrats you have completed all the levels", Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.index);

                } else {
                    Toast.makeText(Level9Colors.this,
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
