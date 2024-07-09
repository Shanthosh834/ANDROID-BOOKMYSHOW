package com.example.day14bookmyshowapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button lgn;
    EditText mail, pass;
    String mailS, passS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mail = findViewById(R.id.mail);
        pass = findViewById(R.id.pass);
        lgn = findViewById(R.id.lgn);
        lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mailS = mail.getText().toString();
                passS = pass.getText().toString();

                if (mailS.equals(""))
                {
                    Toast.makeText(MainActivity2.this, "Please Fill Mail Section", Toast.LENGTH_SHORT).show();
                }
                else if (passS.equals("")) {
                    Toast.makeText(MainActivity2.this, "Please Fill Password Section", Toast.LENGTH_SHORT).show();
                }
                else {

                    Intent i = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(i);
                }
            }
        });
    }
}