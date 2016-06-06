# SoundCloudView
##### A simple SoundCloud player for Android

Save yourself the hassle of creating an MediaPlayer instance and going through the motions of streaming a Soundcloud song when you can just play it directly!

SoundCloudView uses the Soundcloud HTML5 widget as a WebView for playback of any Soundcloud song. Just provide the URL!

to use:

in XML:
```
<com.jasonjohn.soundcloudview.SoundCloudView
  android:id="@+id/soundcloudview"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"/>
```

in the Activity:

soundCloudView = (SoundCloudView) findViewById(R.id.soundcloudview);

soundCloudView.loadSong("https://soundcloud.com/swagytracks/logic-5am-prod-c-sick");

//or use:
//soundCloudView.loadSong("https://soundcloud.com/swagytracks/logic-5am-prod-c-sick", "0099ff); for custom colors
