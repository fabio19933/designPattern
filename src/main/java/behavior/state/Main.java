package behavior.state;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.sentObject();
        order.deliveryObject();
        order.cancel();
        order.cancel();
        System.out.println(order.getFineToPay());
    }
}
