package com.example.amalzoheir.hours;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TherapeuticTourismActivity extends AppCompatActivity {
    Button showEgyptTouristMapButton;
    Button showsiniaTouristMapButton;
    Button showOuounMousaTouristMapButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therapeutic_tourism);
        showEgyptTouristMapButton=(Button) findViewById(R.id.ouoon_mousa_btn1);
        showsiniaTouristMapButton=(Button) findViewById(R.id.sinia_wells_btn);
        showOuounMousaTouristMapButton=(Button) findViewById(R.id.ouoon_mousa_btn2);
        showEgyptTouristMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TherapeuticTourismActivity.this,EgyptTouristMapActivity.class));
            }
        });
        showsiniaTouristMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TherapeuticTourismActivity.this,EgyptTouristMapActivity.class));
            }
        });
        showOuounMousaTouristMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TherapeuticTourismActivity.this,EgyptTouristMapActivity.class));
            }
        });
    }
}
