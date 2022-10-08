package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Milk implements Product{
    private List<Observer> observerList = new ArrayList<>();
    private double price;
    private double discount;
    private int numberOfProduct;

    public Milk(double price, int numberOfProduct) {
        this.price = price;
        this.numberOfProduct = numberOfProduct;
        observerList.forEach(o-> o.update(this));
    }

    @Override
    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public double getNumberOfProduct() {
        return numberOfProduct;
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
        observerList.forEach(o-> o.update(this));
    }

    public double getDiscount() {
        return discount;
    }
}
