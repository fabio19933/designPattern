package behavior.observer;

public interface Product {
    void attachObserver(Observer observer);
    void detachObserver(Observer observer);
    double getNumberOfProduct();
    void setDiscount(double discount);
}
