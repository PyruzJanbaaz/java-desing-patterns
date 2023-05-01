package com.pyruz.proxy.pattern.impl;

import com.pyruz.proxy.pattern.intrface.Media;

public class RealMedia implements Media {
    private String fileName;

    public RealMedia(String fileName) {
        this.fileName = fileName;
        this.loadFromDisk();
    }

    @Override
    public void play() {
        System.out.println("Playing " + fileName);
    }

    private void loadFromDisk(){
        System.out.println("Loading " + fileName);
    }
}
