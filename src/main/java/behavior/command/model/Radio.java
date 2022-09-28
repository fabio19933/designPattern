package behavior.command.model;

public class Radio implements Device{
    @Override
    public void turnOn() {
        System.out.println("turn radio on");
    }

    @Override
    public void turnOff() {
        System.out.println("turn radio off");
    }
}
