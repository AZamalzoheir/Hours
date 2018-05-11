package com.example.amalzoheir.hours;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;

public class PyramidsVideoActivity extends AppCompatActivity {
    //VideoView shpwPyramidsVideoViedeoView;
    private GyroscopeObserver gyroscopeObserver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyramids_video);
       // shpwPyramidsVideoViedeoView=(VideoView)findViewById(R.id.viewPyramids_videoView);
        //String path ="android.resource://"+getPackageName()+"/"+R.raw.view;//"res/raw/view.mp4" ;
        //shpwPyramidsVideoViedeoView.setVideoURI(Uri.parse(path));
        //shpwPyramidsVideoViedeoView.start();
        gyroscopeObserver=new GyroscopeObserver();
        gyroscopeObserver.setMaxRotateRadian(Math.PI/9);
        PanoramaImageView panoramaImageViewLuxor=(PanoramaImageView)findViewById(R.id.pyramids_panoramaimage);
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
