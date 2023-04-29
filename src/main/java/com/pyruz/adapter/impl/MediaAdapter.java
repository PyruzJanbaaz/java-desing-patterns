package com.pyruz.adapter.impl;

import com.pyruz.adapter.intrface.AdvancedMediaPlayer;
import com.pyruz.adapter.intrface.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String mediaType) {
        if (mediaType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer = new Mp4Player();
        if (mediaType.equalsIgnoreCase("wmv"))
            advancedMediaPlayer = new WmvPlayer();
    }

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer.playMp4(fileName);
        if (mediaType.equalsIgnoreCase("wmv"))
            advancedMediaPlayer.playWmv(fileName);
    }
}
