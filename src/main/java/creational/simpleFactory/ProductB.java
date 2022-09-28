package creational.simpleFactory;

public class ProductB extends Product{
    @Override
    public String getNameAndCode() {
        return String.format("Product B name and code %s-%s",getName(), getCode());
    }
}
