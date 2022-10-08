package behavior.state;

public class New implements OrderState{
    @Override
    public double cancellation() {
        System.out.println("No fine to pay");
        return 0;
    }
}
