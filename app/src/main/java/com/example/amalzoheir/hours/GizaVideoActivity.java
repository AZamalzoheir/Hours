package com.example.amalzoheir.hours;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;

public class GizaVideoActivity extends AppCompatActivity {
    //VideoView showGizaVideoView;
    private GyroscopeObserver gyroscopeObserver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giza_video);
       // showGizaVideoView=(VideoView)findViewById(R.id.viewGiza_videoView);
        String path ="android.resource://"+getPackageName()+"/"+R.raw.view;//"res/raw/view.mp4" ;
        //showGizaVideoView.setVideoURI(Uri.parse(path));
        //showGizaVideoView.start();
        gyroscopeObserver=new GyroscopeObserver();
        gyroscopeObserver.setMaxRotateRadian(Math.PI/9);
        PanoramaImageView panoramaImageViewLuxor=(PanoramaImageView)findViewById(R.id.giza_panoramaimage);
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
