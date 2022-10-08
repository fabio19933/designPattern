package behavior.state;

public class Delivered implements OrderState{
    @Override
    public double cancellation() {
        System.out.println("You have got 20€ to pay");
        return 20;
    }
}
