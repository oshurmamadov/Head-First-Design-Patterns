package command;

import command.commands.NoCommand;

public class RemoteControlInvoker {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command commandToUndo = new NoCommand();

    public RemoteControlInvoker() {
        onCommands = new Command[4];
        offCommands = new Command[4];

        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void remoteOnButtonPushed(int slot) {
        execute(onCommands[slot]);
    }

    public void remoteOffButtonPushed(int slot) {
        execute(offCommands[slot]);
    }

    private void execute(Command command) {
        command.execute();
        commandToUndo = command;
    }

    public void remoteUndoButtonPushed() {
        commandToUndo.execute();
    }
}