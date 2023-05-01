package com.pyruz.command.pattern.impl;

import com.pyruz.command.pattern.intrface.Command;
import com.pyruz.command.pattern.receiver.DVDPlayer;

public class DVDPauseCommand implements Command {
    private final DVDPlayer dvdPlayer;

    public DVDPauseCommand(DVDPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    @Override
    public void execute() {
        this.dvdPlayer.pause();
    }
}
