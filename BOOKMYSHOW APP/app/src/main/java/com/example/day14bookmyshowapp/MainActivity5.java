package com.example.day14bookmyshowapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.zip.CRC32;

public class MainActivity5 extends AppCompatActivity {
    Button A1, A2, A3, B1, B2, C1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        A1 = findViewById(R.id.A1);
        A2 = findViewById(R.id.A2);
        A3 = findViewById(R.id.A3);
        B1 = findViewById(R.id.B1);
        B2 = findViewById(R.id.B2);
        C1 = findViewById(R.id.C1);
        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity5.this, "Selected A1 Seat", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(i);
            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity5.this, "Selected A2 Seat", Toast.LENGTH_SHORT).show();
                Intent ii = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(ii);
            }
        });
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity5.this, "Selected A3 Seat", Toast.LENGTH_SHORT).show();
                Intent iii = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(iii);
            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity5.this, "Selected B1 Seat", Toast.LENGTH_SHORT).show();
                Intent four = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(four);
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity5.this, "Selected B2 Seat", Toast.LENGTH_SHORT).show();
                Intent five = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(five);
            }
        });
        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity5.this, "Selected C1 Seat", Toast.LENGTH_SHORT).show();
                Intent six = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(six);
            }
        });
    }
}