package com.example.tanzirulhaquenayan.binarytext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Decrypt extends AppCompatActivity {
    EditText dec_msg;
    Button nextBut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt);

        nextBut = (Button)findViewById(R.id.button4);
        dec_msg = (EditText)findViewById(R.id.editText3);

        nextBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg;
                msg = dec_msg.getText().toString();
                if(msg.length() > 0)
                {
                    Intent intent = new Intent(Decrypt.this, decPIN.class);
                    intent.putExtra("message", msg);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Decrypt.this,"Text Field Is Blank!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
