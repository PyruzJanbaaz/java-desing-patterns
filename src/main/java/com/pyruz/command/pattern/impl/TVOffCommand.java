package com.pyruz.command.pattern.impl;

import com.pyruz.command.pattern.intrface.Command;
import com.pyruz.command.pattern.receiver.TV;

public class TVOffCommand implements Command {
    private final TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.off();
    }
}
