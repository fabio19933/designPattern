package behavior.command.command;

import behavior.command.model.Device;

public class TurnDeviceOff implements Command{
    private Device device;

    public TurnDeviceOff(Device device) {
        this.device = device;
    }

    public TurnDeviceOff() {
    }

    @Override
    public void execute() {
        device.turnOff();
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
