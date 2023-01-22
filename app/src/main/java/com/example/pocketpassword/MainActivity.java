package com.example.pocketpassword;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPass(View view){
        generate newPass = new generate();
        TextView text = (TextView) findViewById(R.id.passwordView);
        Button passButton = (Button) findViewById(R.id.generateButton);
        passButton.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String password = newPass.genPass();
                    text.setText(password);
                }


            });
    }


}