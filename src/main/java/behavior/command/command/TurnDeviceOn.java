package behavior.command.command;

import behavior.command.model.Device;

public class TurnDeviceOn implements Command{
    private Device device;

    public TurnDeviceOn() {
    }

    public TurnDeviceOn(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.turnOn();
    }
    public void setDevice(Device device){
        this.device = device;
    }
}
