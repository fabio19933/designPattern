package behavior.observer;

public class Main {
    public static void main(String[] args) {
        Product milk = new Milk(10,1);
        Observer observer = new ObserverPriceDiscount();
        milk.attachObserver(observer);
        System.out.println(((Milk)milk).getDiscount());
        ((Milk)milk).setNumberOfProduct(6);
        System.out.println(((Milk)milk).getDiscount());
    }
}
