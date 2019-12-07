package com.nawres.jeux_enf.shapes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.nawres.jeux_enf.R;
import com.nawres.jeux_enf.cheatSheet;

public class Level9Shapes extends AppCompatActivity {
    private RadioGroup radioShapesGroup;
    private RadioButton radioShapeButton;
    private RadioButton truth;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level9_shapes);
        addListenerOnButton();

    }

    public void addListenerOnButton() {

        radioShapesGroup = findViewById(R.id.radioShapes1);
        btnDisplay = findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioShapesGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioShapeButton = findViewById(selectedId);
                truth = findViewById(R.id.radioHexagon);

                if (radioShapeButton == truth) {
                    Toast.makeText(Level9Shapes.this, "True.. Congrats you have completed all the levels", Toast.LENGTH_LONG).show();
                    setContentView(R.layout.index);

                } else {
                    Toast.makeText(Level9Shapes.this,
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

