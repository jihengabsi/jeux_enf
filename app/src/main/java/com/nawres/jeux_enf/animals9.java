package com.nawres.jeux_enf;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class animals9 extends AppCompatActivity {

    private RadioGroup radioShapesGroup;
    private RadioButton radioShapeButton;
    private RadioButton truth;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Button menu;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals9);
        LinearLayout ll = findViewById(R.id.layout1);
        AnimationDrawable animated = (AnimationDrawable) ll.getBackground();
        animated.setEnterFadeDuration(2000);
        animated.setExitFadeDuration(4000);
        animated.start();


        menu = findViewById(R.id.btn_menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), menu);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu_animals, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {

                            case R.id.home:
                                Intent i = new Intent(getApplicationContext(), index1.class);
                                startActivity(i);
                                return true;


                            case R.id.level_animal:
                                Intent l = new Intent(getApplicationContext(), animal_level.class);
                                startActivity(l);
                                return true;


                        }

                        return false;
                    }
                });
                popupMenu.show();

            }
        });


        addListenerOnButton();

    }


    public void addListenerOnButton() {

        radioShapesGroup = findViewById(R.id.radioShapes1);
        btnDisplay = findViewById(R.id.button2);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // get selected radio button from radioGroup
                int selectedId = radioShapesGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioShapeButton = findViewById(selectedId);
                truth = findViewById(R.id.radioButton1);

                if (radioShapeButton == truth) {

                    Toast.makeText(animals9.this, "Congrats You have complited all the Levels", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), index1.class);
                    startActivity(i);

                } else {
                    Toast.makeText(animals9.this,
                            "False", Toast.LENGTH_LONG).show();
                }
            }

        });

    }

    public void cheat(View view) {
        Toast.makeText(animals9.this,
                "Dog", Toast.LENGTH_LONG).show();
    }
}
