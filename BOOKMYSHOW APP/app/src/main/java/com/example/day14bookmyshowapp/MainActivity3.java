package com.example.day14bookmyshowapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button onn;
    EditText name, lastname, id1, passw, add, ph;
    String nameS, lastnameS, id1S, passwS, addS, phS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        name = findViewById(R.id.et);
        lastname = findViewById(R.id.lastname);
        id1 = findViewById(R.id.id1);
        passw = findViewById(R.id.passw);
        add = findViewById(R.id.add);
        ph = findViewById(R.id.ph);
        onn = findViewById(R.id.onn);
        onn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameS = name.getText().toString();
                lastnameS = lastname.getText().toString();
                id1S = id1.getText().toString();
                passwS = passw.getText().toString();
                addS = add.getText().toString();
                phS = ph.getText().toString();

                if (nameS.equals(""))
                {
                    Toast.makeText(MainActivity3.this, "Please Fill Name Section", Toast.LENGTH_SHORT).show();
                }

                else if (lastnameS.equals("")) {
                    Toast.makeText(MainActivity3.this, "Please Fill LastName Section", Toast.LENGTH_SHORT).show();
                }

                else if (id1S.equals("")) {
                    Toast.makeText(MainActivity3.this, "Please Fill Mail Id Section", Toast.LENGTH_SHORT).show();
                }

                else if (passwS.equals("")) {
                    Toast.makeText(MainActivity3.this, "Please Fill Password Section", Toast.LENGTH_SHORT).show();
                }

                else if (addS.equals("")) {
                    Toast.makeText(MainActivity3.this, "Please Fill Address Section", Toast.LENGTH_SHORT).show();
                }

                else if (phS.equals("")) {
                    Toast.makeText(MainActivity3.this, "Please Fill Phone Number Section", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Intent i = new Intent(MainActivity3.this, MainActivity2.class);
                    startActivity(i);
                }
            }
        });
    }
}