package command.commands.fan;

import command.recievers.Fan;

public class FanMediumCommand extends FanCommand {

    public FanMediumCommand(Fan fan) {
        super(fan);
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.mediumSpeed();
    }

    @Override
    public void undo() {
        super.undo();
    }
}
