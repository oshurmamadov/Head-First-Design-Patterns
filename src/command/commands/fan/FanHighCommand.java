package command.commands.fan;

import command.recievers.Fan;

public class FanHighCommand extends FanCommand {

    public FanHighCommand(Fan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.highSpeed();
    }

    @Override
    public void undo() {
        super.undo();
    }
}
