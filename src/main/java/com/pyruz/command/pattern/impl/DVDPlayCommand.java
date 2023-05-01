package com.pyruz.command.pattern.impl;

import com.pyruz.command.pattern.intrface.Command;
import com.pyruz.command.pattern.receiver.DVDPlayer;

public class DVDPlayCommand implements Command {
    private final DVDPlayer dvdPlayer;

    public DVDPlayCommand(DVDPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    @Override
    public void execute() {
        this.dvdPlayer.play();
    }
}
