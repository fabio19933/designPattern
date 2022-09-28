package creational.simpleFactory;

public class Main {
    public static void main(String[] args) {
        Product a = FactoryProduct.getProduct("a");
        a.setCode("code");
        a.setName("name");
        System.out.println(a.getNameAndCode());
    }
}
