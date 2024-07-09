package com.example.day14bookmyshowapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    Spinner sp;

    EditText et;

    Button btn;

    String selectedLogus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        sp = findViewById(R.id.sp);
        et = findViewById(R.id.et);
        btn = findViewById(R.id.btn);

        String [] pay = {"G-Pay" , "Phone Pay"};

        ArrayAdapter<String> a = new ArrayAdapter<>(MainActivity6.this, android.R.layout.simple_spinner_item, pay);
        sp.setAdapter(a);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(MainActivity6.this, "Your Payment done", Toast.LENGTH_SHORT).show();
            }
        });
    }
}