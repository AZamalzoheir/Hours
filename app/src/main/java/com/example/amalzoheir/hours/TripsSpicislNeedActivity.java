package com.example.amalzoheir.hours;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class TripsSpicislNeedActivity extends AppCompatActivity {
    Button showCityDescryptionButton;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.basicmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trips_spicisl_need);
        showCityDescryptionButton=(Button) findViewById(R.id.luxor_needs_btn);
        showCityDescryptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TripsSpicislNeedActivity.this,LuxorDescripionActivity.class));
            }
        });
    }
}
