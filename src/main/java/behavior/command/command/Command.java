package behavior.command.command;

import behavior.command.model.Device;

public interface Command {
    void execute();
    void setDevice(Device device);
}
