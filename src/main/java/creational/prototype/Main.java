package creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        FactoryProduct factoryProduct = new FactoryProduct();
        ProductA p = new ProductA();
        System.out.println(p);
        System.out.println(factoryProduct.makeCopy(p));
    }
}
