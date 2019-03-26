package com.example.tanzirulhaquenayan.binarytext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Encrypt extends AppCompatActivity {
    Button nextBut;
    EditText encrypt_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrypt);

        nextBut = (Button)findViewById(R.id.button);
        encrypt_message = (EditText)findViewById(R.id.editText);

        nextBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg;
                msg = encrypt_message.getText().toString();
                if(msg.length() > 0)
                {
                    Intent intent = new Intent(Encrypt.this, PIN.class);
                    intent.putExtra("message", msg);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Encrypt.this,"Text Field Is Blank!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
