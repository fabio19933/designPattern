package behavior.state;

public class Order {

    private OrderState orderState;
    private double fineToPay;

    public Order() {
        this.createObject();
    }

    public double cancel(){
        fineToPay = orderState.cancellation();
        orderState = new Cancelled();
        return fineToPay;
    }
    public void createObject(){
        orderState = new New();
    }
    public void deliveryObject(){
        orderState = new Delivered();
    }
    public void sentObject(){
        orderState = new Sent();
    }

    public double getFineToPay() {
        return fineToPay;
    }
}
