package behavior.command.model;

public class Television implements Device{
    @Override
    public void turnOn() {
        System.out.println("turn tv on");
    }

    @Override
    public void turnOff() {
        System.out.println("turn tv off");
    }
}
