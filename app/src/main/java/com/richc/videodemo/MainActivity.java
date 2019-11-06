package com.richc.videodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vv = findViewById(R.id.demoVideoView);

        vv.setVideoPath("android.resource://" + getPackageName() + '/' + R.raw.open_highway_long_road_winter);

        vv.start();
    }
}
