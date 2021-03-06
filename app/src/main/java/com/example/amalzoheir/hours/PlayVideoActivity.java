package com.example.amalzoheir.hours;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;

public class PlayVideoActivity extends AppCompatActivity {
    //VideoView showVideoView;
    private GyroscopeObserver gyroscopeObserver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);
      //  showVideoView=(VideoView)findViewById(R.id.view_videoView);
        String path ="android.resource://"+getPackageName()+"/"+R.raw.view;//"res/raw/view.mp4" ;
        //showVideoView.setVideoURI(Uri.parse(path));
        //showVideoView.start();
        gyroscopeObserver=new GyroscopeObserver();
        gyroscopeObserver.setMaxRotateRadian(Math.PI/9);
        PanoramaImageView panoramaImageViewLuxor=(PanoramaImageView)findViewById(R.id.luxor_panoramaimage);
        panoramaImageViewLuxor.setGyroscopeObserver(gyroscopeObserver);

    }

    @Override
    protected void onPause() {
        super.onPause();
        gyroscopeObserver.unregister();
    }

    @Override
    protected void onResume() {
        super.onResume();
        gyroscopeObserver.register(this);
    }
}
