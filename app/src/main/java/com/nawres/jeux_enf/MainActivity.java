package com.nawres.jeux_enf;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    final String EXTRA_Name = "kids_name";


    EditText prenom_par, prenom_enf, email, mdp;
    Button registerbtn;
    TextView loginbtn;
    FirebaseAuth fAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prenom_par = findViewById(R.id.parent);
        prenom_enf = findViewById(R.id.enfant);
        email = findViewById(R.id.email);
        mdp = findViewById(R.id.mdp);
        registerbtn = findViewById(R.id.registerbtn);
        loginbtn = findViewById(R.id.createText);


        fAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar);


        if (fAuth.getCurrentUser() != null) {
            startActivity(new Intent(getApplicationContext(), index1.class));


        }

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail = email.getText().toString().trim();
                String password = mdp.getText().toString().trim();
                String parent_name = prenom_par.getText().toString().trim();
                final String kids_name = prenom_enf.getText().toString().trim();


                if (TextUtils.isEmpty(parent_name)) {
                    prenom_par.setError("Parent Name is required");
                    return;
                }

                if (parent_name.length() < 3) {
                    prenom_par.setError("Parent Name must be >= 3 Charactere");
                }

                if (TextUtils.isEmpty(kids_name)) {
                    prenom_enf.setError("Child Name is required");
                    return;
                }

                if (kids_name.length() < 3) {
                    prenom_enf.setError("Child Name must be >= 3 Charactere");
                }


                if (TextUtils.isEmpty(mail)) {
                    email.setError("Email is required");
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    mdp.setError("Password is required");
                    return;
                }


                if (password.length() < 5) {
                    mdp.setError("Password must be >= 5 Charactere");
                }


                progressBar.setVisibility(View.VISIBLE);

                fAuth.createUserWithEmailAndPassword(mail, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(MainActivity.this, "User created",
                                            Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(MainActivity.this,
                                            index1.class);
                                    intent.putExtra(EXTRA_Name, kids_name);
                                    startActivity(intent);

                                } else {
                                    Toast.makeText(MainActivity.this, "Error!!!"
                                                    + task.getException().getMessage(),
                                            Toast.LENGTH_SHORT).show();
                                    progressBar.setVisibility(View.GONE);
                                }

                            }
                        });


            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
            }
        });

    }
}

