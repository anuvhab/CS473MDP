package com.android.musicplayertemplate;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {
    VideoView vv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        vv = (VideoView) findViewById(R.id.vv);
    }

    public void play(View view) {
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.sample);
        vv.setVideoURI(uri);
        vv.start();
    }
}
