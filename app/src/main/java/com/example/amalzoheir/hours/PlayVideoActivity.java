package com.example.amalzoheir.hours;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class PlayVideoActivity extends AppCompatActivity {
    VideoView showVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);
        showVideoView=(VideoView)findViewById(R.id.view_videoView);
        String path ="android.resource://"+getPackageName()+"/"+R.raw.view;//"res/raw/view.mp4" ;
        showVideoView.setVideoURI(Uri.parse(path));
        showVideoView.start();

    }
}
