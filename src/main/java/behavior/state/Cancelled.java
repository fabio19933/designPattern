package behavior.state;

public class Cancelled implements OrderState{
    @Override
    public double cancellation() {
        throw new IllegalStateException("you can't cancel a cancelled order");
    }
}
