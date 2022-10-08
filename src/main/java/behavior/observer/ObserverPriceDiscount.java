package behavior.observer;

public class ObserverPriceDiscount implements Observer{
    @Override
    public void update(Product product) {
        if (product.getNumberOfProduct()>5){
            product.setDiscount(2.0);
        }
    }
}
