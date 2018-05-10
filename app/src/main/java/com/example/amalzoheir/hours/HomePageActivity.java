package com.example.amalzoheir.hours;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class HomePageActivity extends AppCompatActivity {
    Button showVideoButton;
    Button tripSpicialNeedButton;
    Button showEgyptTouristButton;
    Button showProfileButton;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.basicmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        showVideoButton=(Button) findViewById(R.id.video_btn);
        tripSpicialNeedButton=(Button) findViewById(R.id.trips_need_btn);
        showEgyptTouristButton=(Button) findViewById(R.id.egypt_tourist_map_btn);
        showProfileButton=(Button) findViewById(R.id.profile_btn);
        showVideoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, ShowVideoActivity.class));
            }
        });
        tripSpicialNeedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, TripsSpicislNeedActivity.class));
            }
        });
        showEgyptTouristButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, EgyptionTouristActivity.class));
            }
        });
        showProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, ProfileActivity.class));
            }
        });
    }
}
