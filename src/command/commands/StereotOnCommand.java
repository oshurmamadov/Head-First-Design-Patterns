package command.commands;

import command.Command;
import command.recievers.Light;
import command.recievers.Stereo;

public class StereotOnCommand implements Command {
    private Stereo stereo;

    public StereotOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setVolume(10);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
