package com.example.studdybuddy.studdybuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SBSettings extends AppCompatActivity {

    public ImageButton closeset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbsettings);

        closeset = (ImageButton)findViewById(R.id.exitButton2);
        closeset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeset();
            }
        });

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.id_Home){
            openHome();
        }
        if(item.getItemId()==R.id.id_calendar){
            openCalendar();
        }

        if(item.getItemId()==R.id.id_forums){
            openforum();
        }

        if(item.getItemId() == R.id.id_review){
            openReview();
        }

        if(item.getItemId()==R.id.id_settings){
            startSettings();
        }

        return super.onOptionsItemSelected(item);
    }

    public void openforum(){
        Intent intentforum = new Intent(SBSettings.this,SB_Forum.class);
        startActivity(intentforum);
    }

    public void openCalendar(){
        Intent intentCalendar = new Intent(SBSettings.this,SB_Calendar.class);
        startActivity(intentCalendar);
    }

    public void openReview(){
        Intent intentReview = new Intent(SBSettings.this,SB_Review.class);
        startActivity(intentReview);

    }
    public void openHome(){
        Intent intentHome = new Intent(SBSettings.this,SB_Main.class);
        startActivity(intentHome);
    }

    public void startSettings(){
        Intent intentsettings = new Intent(SBSettings.this,SBSettings.class);
        startActivity(intentsettings);
    }




    public void closeset(){
        Intent closereg = new Intent(SBSettings.this,SB_Main.class);
        startActivity(closereg);
    }



}

