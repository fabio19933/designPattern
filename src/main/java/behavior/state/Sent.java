package behavior.state;

public class Sent implements OrderState{
    @Override
    public double cancellation() {
        System.out.println("You have got 10€ to pay");
        return 10;
    }
}
