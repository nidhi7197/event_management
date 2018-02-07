package com.example.nidhi.event_management;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Babyshower_screen_display_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babyshower_screen_display_activity);
        Intent babyShowerActivity=getIntent();
    }
}
