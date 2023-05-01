package com.pyruz.proxy.pattern;

import com.pyruz.proxy.pattern.impl.RealMedia;
import com.pyruz.proxy.pattern.intrface.Media;

public class ProxyMedia implements Media {
    private RealMedia realMedia;
    private String fileName;

    public ProxyMedia(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        if (this.realMedia == null) {
            this.realMedia = new RealMedia(this.fileName);
        }
        realMedia.play();
    }
}
