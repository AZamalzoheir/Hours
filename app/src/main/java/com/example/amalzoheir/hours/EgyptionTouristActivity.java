package com.example.amalzoheir.hours;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class EgyptionTouristActivity extends AppCompatActivity {
    Button showTherapeuticTourismButton;
    Button showLesureTourismButton;
    Button showJndoorTourismButton;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.basicmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egyption_tourist);
        showTherapeuticTourismButton=(Button) findViewById(R.id.therappeutic_tourism_btn);
        showLesureTourismButton=(Button) findViewById(R.id.lesure_tourism_btn);
        showJndoorTourismButton=(Button) findViewById(R.id.jndoor_tourism_btn);
        showTherapeuticTourismButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EgyptionTouristActivity.this, TherapeuticTourismActivity.class));
            }
        });
        showLesureTourismButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EgyptionTouristActivity.this, TherapeuticTourismActivity.class));
            }
        });
        showJndoorTourismButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EgyptionTouristActivity.this, TherapeuticTourismActivity.class));
            }
        });
    }
}
