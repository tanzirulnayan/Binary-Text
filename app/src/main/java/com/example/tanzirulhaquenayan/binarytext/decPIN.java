package com.example.tanzirulhaquenayan.binarytext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class decPIN extends AppCompatActivity {
    Button decBut;
    EditText dec_pin_tf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dec_pin);

        decBut = (Button)findViewById(R.id.button5);
        dec_pin_tf = (EditText)findViewById(R.id.editText5);

        Intent intent = getIntent();
        final String msg = intent.getStringExtra("message");

        decBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dec_msg = "";
                int pin_int;
                int i;
                int j = 0;
                int msg_int[] = new int[3000];
                String pin_str = dec_pin_tf.getText().toString();
                if(pin_str.length() == 0)
                {
                    Toast.makeText(decPIN.this,"You must enter a 4 digit PIN", Toast.LENGTH_LONG).show();
                }
                else if (pin_str.length() != 4)
                {
                    Toast.makeText(decPIN.this,"PIN must be number & exactly 4 digit long", Toast.LENGTH_LONG).show();
                }
                else if(pin_str.length() == 4)
                {
                    pin_int = (int) pin_str.charAt(2);
                    int msg_ascii;
                    String temp = new String();
                    for (i=0; i<msg.length(); i++) {
                        if(msg.charAt(i) != ' ')
                        {
                            temp = temp + msg.charAt(i);
                        }
                        else if(msg.charAt(i) == ' ')
                        {
                            int decimal = Integer.parseInt(temp, 2);
                            decimal -= pin_int;
                            char c = (char) decimal;
                            temp = "";
                            dec_msg = dec_msg + c;
                        }
                    }
                    Intent intent = new Intent(decPIN.this, DecryptedMessage.class);
                    intent.putExtra("decrypted_message", dec_msg);
                    startActivity(intent);
                }

            }
        });
    }
}
