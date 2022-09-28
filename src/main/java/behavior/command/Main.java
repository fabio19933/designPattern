package behavior.command;

import behavior.command.command.Command;
import behavior.command.command.TurnDeviceOff;
import behavior.command.command.TurnDeviceOn;
import behavior.command.invoker.Button;
import behavior.command.model.Device;
import behavior.command.model.Radio;
import behavior.command.model.Television;

public class Main {
    public static void main(String[] args) {
        Device radio = new Radio();
        Device television = new Television();
        Command turnDeviceOff = new TurnDeviceOff();
        Command turnDeviceOn = new TurnDeviceOn();
        Button button = new Button();

        button.setCommand(turnDeviceOff);
        turnDeviceOff.setDevice(radio);
        button.press();
        turnDeviceOn.setDevice(television);
        button.setCommand(turnDeviceOn);
        button.press();
    }
}
