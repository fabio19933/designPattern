package creational.objectPoll;

public class Product implements Poolable{
    private String name;
    @Override
    public void reset() {
        name=null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
