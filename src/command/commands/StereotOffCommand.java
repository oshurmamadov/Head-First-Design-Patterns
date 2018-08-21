package command.commands;

import command.Command;
import command.recievers.Stereo;

public class StereotOffCommand implements Command {
    private Stereo stereo;

    public StereotOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setVolume(10);
    }
}
