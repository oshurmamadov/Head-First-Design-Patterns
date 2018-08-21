package command.commands.fan;

import command.recievers.Fan;

public class FanOffCommand extends FanCommand {

    public FanOffCommand(Fan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.off();
    }

    @Override
    public void undo() {
        super.undo();
    }
}