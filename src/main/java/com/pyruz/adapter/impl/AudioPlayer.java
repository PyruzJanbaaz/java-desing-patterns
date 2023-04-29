package com.pyruz.adapter.impl;

import com.pyruz.adapter.intrface.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String mediaType, String fileName) {
        MediaAdapter mediaAdapter;
        if (mediaType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        } else if (mediaType.equalsIgnoreCase("mp4") || mediaType.equalsIgnoreCase("wmv")) {
            mediaAdapter = new MediaAdapter(mediaType);
            mediaAdapter.play(mediaType, fileName);
        } else {
            System.out.println("Invalid media type. Only MP3, MP4, and WMV are supported.");
        }
    }
}
