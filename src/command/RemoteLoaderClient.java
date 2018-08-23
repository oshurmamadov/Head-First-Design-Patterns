package command;

import command.commands.*;
import command.commands.fan.FanHighCommand;
import command.commands.fan.FanOffCommand;
import command.recievers.Fan;
import command.recievers.Light;
import command.recievers.Stereo;

public class RemoteLoaderClient {

    public static void main(String[] args) {
        RemoteControlInvoker invoker = new RemoteControlInvoker(); //invoker

        Light kitchenLight = new Light("Kitchen Light"); // receivers
        Stereo stereo = new Stereo("Bass Stereo");
        Fan fan = new Fan("Living Room Fan");

        Command lightOn = new LightOnCommand(kitchenLight); // commands
        Command lightOff = new LightOffCommand(kitchenLight);

        Command stereoOn = new StereotOnCommand(stereo);
        Command stereoOff = new StereotOffCommand(stereo);

        Command fanHigh = new FanHighCommand(fan);
        Command fanOff = new FanOffCommand(fan);

        invoker.setCommand(0, lightOn, lightOff); // delegating commands to invoker
        invoker.setCommand(1, stereoOn, stereoOff);
        invoker.setCommand(2, fanHigh, fanOff);

        invoker.remoteOnButtonPushed(0); //fire request/command
        invoker.remoteOnButtonPushed(1);
        invoker.remoteOnButtonPushed(2);
        invoker.remoteOffButtonPushed(0);
        invoker.remoteUndoButtonPushed();

        System.out.println("\n Multicommand stuff\n");

        Command[] commandsOn = {lightOn, stereoOn, fanHigh};
        MultiCommand multiCommandOn = new MultiCommand(commandsOn);

        Command[] commandsOff = {lightOff, stereoOff, fanOff};
        MultiCommand multiCommandOff = new MultiCommand(commandsOff);

        invoker.setCommand(3, multiCommandOn, multiCommandOff);
        invoker.remoteOnButtonPushed(3);
        invoker.remoteOffButtonPushed(3);
        invoker.remoteUndoButtonPushed();
    }
}
