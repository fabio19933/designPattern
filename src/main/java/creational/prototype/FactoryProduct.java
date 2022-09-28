package creational.prototype;

public class FactoryProduct {
    public Product makeCopy(Product p) throws CloneNotSupportedException {
       return p.makeCopy();
    }
}
