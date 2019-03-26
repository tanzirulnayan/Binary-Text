package com.example.tanzirulhaquenayan.binarytext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EncryptedMessage extends AppCompatActivity {
    Button HomeBut;
    TextView encrypted_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrypted_message);

        HomeBut = (Button)findViewById(R.id.button8);
        encrypted_message = (TextView) findViewById(R.id.textView10);

        Intent intent = getIntent();
        final String enc_msg = intent.getStringExtra("encrypted_message");

        encrypted_message.setText(enc_msg);

        HomeBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EncryptedMessage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
