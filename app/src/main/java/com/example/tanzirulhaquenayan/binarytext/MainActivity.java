package com.example.tanzirulhaquenayan.binarytext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button encBut;
    Button decBut;
    Button aboutBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encBut = (Button)findViewById(R.id.button1);
        decBut = (Button)findViewById(R.id.button2);
        aboutBut = (Button)findViewById(R.id.button6);

        encBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Encrypt.class);
                startActivity(intent);

            }
        });

        decBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Decrypt.class);
                startActivity(intent);
            }
        });

        aboutBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, about.class);
                startActivity(intent);
            }
        });
    }
}
