package com.example.amalzoheir.hours;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LuxorPlaces extends AppCompatActivity {
    Button showLuxorKarnakButton;
    Button showLuxorHatchbsotButton;
    Button showLuxorFillaButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luxor_places);
        showLuxorKarnakButton=(Button) findViewById(R.id.luxorkarnak_video_btn);
        showLuxorHatchbsotButton=(Button) findViewById(R.id.luxorhatshbsot_video_btn);
        showLuxorFillaButton=(Button) findViewById(R.id.luxorfilaa_video_btn);
        showLuxorKarnakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LuxorPlaces.this,Karnak.class));
            }
        });
        showLuxorHatchbsotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LuxorPlaces.this,Karnak.class));
            }
        });
        showLuxorFillaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LuxorPlaces.this,Karnak.class));
            }
        });
    }
}
