package creational.simpleFactory;

public abstract class Product {
    private String name;
    private String code;
    public abstract String getNameAndCode();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
