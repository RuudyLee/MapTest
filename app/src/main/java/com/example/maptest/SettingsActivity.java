package com.example.maptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    /////////////
    // BUTTONS //
    /////////////

    public void vehiclePressed(View view) {
        Intent intent = new Intent(this, VehicleActivity.class);
        startActivity(intent);
    }

    public void healthPressed(View view) {
        Intent intent = new Intent(this, HealthActivity.class);
        startActivity(intent);
    }

    public void mapsPressed(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void mediaPressed(View view) {
        Intent intent = new Intent(this, MediaActivity.class);
        startActivity(intent);
    }

    public void infoPressed(View view) {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
}
