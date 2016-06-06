package com.jasonjohn.soundcloudlibsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jasonjohn.soundcloudview.SoundCloudView;

public class MainActivity extends AppCompatActivity {
    private SoundCloudView soundCloudView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundCloudView = (SoundCloudView) findViewById(R.id.soundcloudview);

        soundCloudView.loadSong("https://soundcloud.com/swagytracks/logic-5am-prod-c-sick", "0099ff");
    }
}
