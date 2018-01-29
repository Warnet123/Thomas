package com.example.studdybuddy.studdybuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SBRegister extends AppCompatActivity {

    private ImageButton exitbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbregister);


        exitbutton = (ImageButton) findViewById(R.id.exitButton);
        exitbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                closereg();
            }
        });

    }

    public void closereg(){
        Intent closereg = new Intent(SBRegister.this,SBLogin.class);
        startActivity(closereg);
    }
}
