package com.pyruz.adapter;

import com.pyruz.adapter.impl.AudioPlayer;
import com.pyruz.adapter.intrface.MediaPlayer;

public class AdapterDemo {
    public static void main(String[] args) {
        MediaPlayer audioPlayer =  new AudioPlayer();
        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "movie.mp4");
        audioPlayer.play("wmv", "video.wmv");
        audioPlayer.play("avi", "movie.avi");
    }
}
