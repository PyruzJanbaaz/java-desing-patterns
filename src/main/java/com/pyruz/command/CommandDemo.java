package com.pyruz.command;

import com.pyruz.command.pattern.impl.DVDPauseCommand;
import com.pyruz.command.pattern.impl.DVDPlayCommand;
import com.pyruz.command.pattern.impl.TVOffCommand;
import com.pyruz.command.pattern.impl.TVOnCommand;
import com.pyruz.command.pattern.intrface.Command;
import com.pyruz.command.pattern.invoker.RemoteControl;
import com.pyruz.command.pattern.receiver.DVDPlayer;
import com.pyruz.command.pattern.receiver.TV;


public class CommandDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        Command tvOnCommand = new TVOnCommand(tv);
        Command tvOffCommand = new TVOffCommand(tv);

        DVDPlayer dvdPlayer = new DVDPlayer();
        Command dvdPlayCommand = new DVDPlayCommand(dvdPlayer);
        Command dvdPauseCommand = new DVDPauseCommand(dvdPlayer);

        RemoteControl remoteControl = new RemoteControl(new Command[]{tvOnCommand, tvOffCommand, dvdPlayCommand, dvdPauseCommand});

        // tvOnCommand, tvOffCommand
        remoteControl.executeCommand(0);
        remoteControl.executeCommand(1);

        // dvdPlayCommand, dvdPauseCommand
        remoteControl.executeCommand(2);
        remoteControl.executeCommand(3);
    }
}
