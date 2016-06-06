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

```
String songUrl = "https://soundcloud.com/swagytracks/logic-5am-prod-c-sick";

soundCloudView = (SoundCloudView) findViewById(R.id.soundcloudview);

soundCloudView.loadSong(songUrl);

//or use:
//soundCloudView.loadSong(songUrl, "0099ff); for custom colors
```

##License
```
Copyright 2016 Jason John

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
