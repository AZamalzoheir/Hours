package com.example.amalzoheir.hours;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ShowVideoActivity extends AppCompatActivity {
    Button showVideoPlay;
    Button showPyramidsVideoPlay;
    Button showGizaVideoPlay;
    Button showAswanVideoPlay;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.basicmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_video);
        showVideoPlay=(Button)findViewById(R.id.luxor_video_btn);
        showPyramidsVideoPlay=(Button)findViewById(R.id.pyramids_video_btn);
        showGizaVideoPlay=(Button)findViewById(R.id.Giza_video_btn);
        showAswanVideoPlay=(Button)findViewById(R.id.aswan_video_btn);
        showVideoPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShowVideoActivity.this, LuxorPlaces.class));
            }
        });
        showPyramidsVideoPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShowVideoActivity.this, PyramidsVideoActivity.class));
            }
        });
        showGizaVideoPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShowVideoActivity.this, GizaVideoActivity.class));
            }
        });
        showAswanVideoPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShowVideoActivity.this,MainActivity.class));
            }
        });

    }
}
