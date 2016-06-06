package com.jasonjohn.soundcloudview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by jtjohn on 6/6/2016.
 */
public class SoundCloudView extends WebView {
    private static final String SOUNDCLOUD_WIDGET_HTML =
            "<!DOCTYPE html><html><body><iframe " +
                    "width=\"100%%\" " +
                    "height=\"100%%\" " +
                    "scrolling=\"yes\" " +
                    "frameborder=\"no\" " +
                    "src=\"https://w.soundcloud.com/player/?url=%s" +
                    "&color=%s\">" +
                    "</iframe></body></html>";

    public SoundCloudView(Context context) {
        super(context);
    }

    public SoundCloudView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SoundCloudView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    public void loadSong(String songUrl) {
        String url = String.format(SOUNDCLOUD_WIDGET_HTML, songUrl, "default");
        getSettings().setJavaScriptEnabled(true);
        loadDataWithBaseURL("",url,"text/html", "UTF-8", "FF5500");
    }

    public void loadSong(String songUrl, String color) {
        if(!color.matches("([A-Z, 0-9]){6}")) {
            throw new RuntimeException("Specified color is badly formatted (required: HEX format (without #))");
        }
        String url = String.format(SOUNDCLOUD_WIDGET_HTML, songUrl, color);
        getSettings().setJavaScriptEnabled(true);
        loadDataWithBaseURL("",url,"text/html", "UTF-8", "");
    }
}
