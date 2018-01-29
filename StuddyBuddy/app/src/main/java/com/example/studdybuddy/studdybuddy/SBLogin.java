package com.example.studdybuddy.studdybuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SBLogin extends AppCompatActivity {

    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sblogin);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                openMain();
            }

        });



    }


    public void openMain(){

        Intent intentmain = new Intent(this, SB_Main.class);
        startActivity(intentmain);

    }

    public void onClick(View v){
        Intent intentregister = new Intent(SBLogin.this,SBRegister.class);
        startActivity(intentregister);

    }
}
