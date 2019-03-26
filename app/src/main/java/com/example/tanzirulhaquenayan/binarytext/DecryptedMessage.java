package com.example.tanzirulhaquenayan.binarytext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DecryptedMessage extends AppCompatActivity {
    Button HomeBut;
    TextView decrypted_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypted_message);

        HomeBut = (Button)findViewById(R.id.button7);
        decrypted_message = (TextView)findViewById(R.id.textView13);

        Intent intent = getIntent();
        final String enc_msg = intent.getStringExtra("decrypted_message");

        decrypted_message.setText(enc_msg);

        HomeBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DecryptedMessage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
