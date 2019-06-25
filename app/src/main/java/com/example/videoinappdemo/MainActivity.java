package com.example.videoinappdemo;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vid1 = (VideoView) findViewById(R.id.video1);

        vid1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.joeroganvideo);

        MediaController mediaController = new MediaController(this); //initialize a media controller to control skipping and pausing etc.
        mediaController.setAnchorView(vid1); //this connects the media controls to vid1
        vid1.setMediaController(mediaController); //officially gives media controller to the video

        vid1.start(); //starts the video

    }
}
