package com.pyruz.adapter.impl;

import com.pyruz.adapter.intrface.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }

    @Override
    public void playWmv(String fileName) {
        // Do nothing - this player cannot play WMV files
    }
}
