package creational.simpleFactory;

public class FactoryProduct {

    public static Product getProduct(String type){
        switch (type){
            case "a":
                return new ProductA();
            case "b":
                return new ProductB();
            default:
                throw new IllegalArgumentException("type not found");
        }
    }
}
