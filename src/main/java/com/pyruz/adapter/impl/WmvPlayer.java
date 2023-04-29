package com.pyruz.adapter.impl;

import com.pyruz.adapter.intrface.AdvancedMediaPlayer;

public class WmvPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        // Do nothing - this player cannot play MP4 files
    }

    @Override
    public void playWmv(String fileName) {
        System.out.println("Playing WMV file: " + fileName);
    }
}
