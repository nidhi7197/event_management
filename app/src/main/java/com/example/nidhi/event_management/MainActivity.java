package com.example.nidhi.event_management;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

        public void displayWeddingScreen(View view){

            Intent weddingActivity=new Intent(this, Wedding_screen_display_activity.class);
            startActivity(weddingActivity);
    }
    public void displayBirthdayScreen(View view){

        Intent birthdayActivity=new Intent(this, Birthday_screen_display.class);
        startActivity(birthdayActivity);
    }
    public void displayBabyshowerScreen(View view){

        Intent babyShowerActivity=new Intent(this, Babyshower_screen_display_activity.class);
        startActivity(babyShowerActivity);
    }
    public void displayAnniversaryScreen(View view){

        Intent anniversaryActivity=new Intent(this, Anniversary_screen_display.class);
        startActivity(anniversaryActivity);
    }
}

