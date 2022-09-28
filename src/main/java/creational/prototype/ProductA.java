package creational.prototype;

public class ProductA implements Product {
    public ProductA() {
        System.out.println("Costructor A");
    }

    @Override
    public Product makeCopy() throws CloneNotSupportedException {
        return (Product) super.clone();
    }
}
