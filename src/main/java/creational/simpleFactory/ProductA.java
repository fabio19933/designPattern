package creational.simpleFactory;

public class ProductA extends Product{
    @Override
    public String getNameAndCode() {
        return String.format("Product A name and code %s-%s",getName(), getCode());
    }
}
