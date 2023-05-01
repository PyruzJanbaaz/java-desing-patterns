package com.pyruz.proxy;

import com.pyruz.proxy.pattern.ProxyMedia;
import com.pyruz.proxy.pattern.intrface.Media;

public class ProxyDemo {
    public static void main(String[] args) {
        Media media = new ProxyMedia("video.mp4");
        media.play(); // The video file is loaded from disk and played.
        media.play(); // The video file is already in the cache and played directly.
    }
}
