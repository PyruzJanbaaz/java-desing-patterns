package com.pyruz.command.pattern.invoker;

import com.pyruz.command.pattern.intrface.Command;

public class RemoteControl {
    private Command[] commands;

    public RemoteControl(Command[] commands) {
        this.commands = commands;
    }

    public void executeCommand(int slot){
        commands[slot].execute();
    }
}
