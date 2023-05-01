package com.pyruz.command.pattern.impl;

import com.pyruz.command.pattern.intrface.Command;
import com.pyruz.command.pattern.receiver.TV;

public class TVOnCommand implements Command {
    private final TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.on();
    }
}
