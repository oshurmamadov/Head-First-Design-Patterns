package command.commands;

import command.Command;

public class MultiCommand implements Command {
    private Command[] commands;

    public MultiCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(Command command: commands)
            command.execute();
    }

    @Override
    public void undo() {
        for(Command command: commands)
            command.undo();
    }
}
