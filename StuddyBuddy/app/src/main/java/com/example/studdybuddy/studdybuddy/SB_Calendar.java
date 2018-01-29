package com.example.studdybuddy.studdybuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SB_Calendar extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sb__calendar);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
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

        if(item.getItemId() == R.id.id_settings){
            startSettings();
        }

        return super.onOptionsItemSelected(item);
    }

    public void openforum(){
        Intent intentforum = new Intent(SB_Calendar.this,SB_Forum.class);
        startActivity(intentforum);
    }

    public void openCalendar(){
        Intent intentCalendar = new Intent(SB_Calendar.this,SB_Calendar.class);
        startActivity(intentCalendar);
    }

    public void openReview(){
        Intent intentReview = new Intent(SB_Calendar.this,SB_Review.class);
        startActivity(intentReview);

    }
    public void openHome(){
        Intent intentHome = new Intent(SB_Calendar.this,SB_Main.class);
        startActivity(intentHome);
    }

    public void startSettings(){
        Intent intentsettings = new Intent(SB_Calendar.this,SBSettings.class);
        startActivity(intentsettings);
    }

}
