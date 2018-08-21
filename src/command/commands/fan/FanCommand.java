package command.commands.fan;

import command.Command;
import command.recievers.Fan;

public abstract class FanCommand implements Command {
    Fan fan;
    int prevSpeed;

    FanCommand(Fan fan) {
        this.fan = fan;
    }

    public void undo() {
        if (prevSpeed == Fan.HIGH) {
            fan.highSpeed();
        } else if (prevSpeed == Fan.MEDIUM) {
            fan.mediumSpeed();
        } else if (prevSpeed == Fan.OFF){
            fan.off();
        }
    }
}