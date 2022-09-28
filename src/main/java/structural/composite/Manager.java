package structural.composite;

public class Manager implements Employee{
    @Override
    public void description() {
        System.out.println("I'm a manager");
    }
}
