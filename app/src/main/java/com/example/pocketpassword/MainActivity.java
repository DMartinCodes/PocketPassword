package com.example.pocketpassword;

import androidx.appcompat.app.AppCompatActivity;


import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.ClipboardManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPass(View view){
        generate newPass = new generate();
        TextView text = (TextView) findViewById(R.id.passwordView);
        TextView passwordText = (TextView) findViewById(R.id.passwordView);
        Button passButton = (Button) findViewById(R.id.generateButton);
        passButton.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);

                    String password = newPass.genPass();
                    text.setText("Your new secure password is: \n \n" + password);

                    ClipData clip = ClipData.newPlainText("", password);
                    clipboard.setPrimaryClip(clip);

                    Toast.makeText(MainActivity.this, "Password Copied to Clipboard", Toast.LENGTH_SHORT).show();
                }


            });
    }


}