package structural.decorator;

public class SimplePizza implements Pizza{
    @Override
    public String description() {
        return "simple pizza";
    }

    @Override
    public Double cost() {
        return 1.0;
    }
}
