package com.nawres.jeux_enf.shapes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.nawres.jeux_enf.R;
import com.nawres.jeux_enf.cheatSheet;

public class Level7Shapes extends AppCompatActivity {


    private Button btnDisplay;
    private EditText choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level7_shapes);
        addListenerOnButton();
    }

    public void addListenerOnButton() {


        btnDisplay = findViewById(R.id.btnDisplay);
        choice = findViewById(R.id.editText3);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (choice.getText().toString().equals("Parallelogram")) {
                    Toast.makeText(Level7Shapes.this, "True", Toast.LENGTH_SHORT).show();
                    Intent l = new Intent(getApplicationContext(), Level8Shapes.class);
                    startActivity(l);

                } else {
                    Toast.makeText(Level7Shapes.this,
                            "False", Toast.LENGTH_LONG).show();
                }
            }

        });

    }

    public void help(View view) {
        Intent l = new Intent(getApplicationContext(), cheatSheet.class);
        startActivity(l);

    }
}
