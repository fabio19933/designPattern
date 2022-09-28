package structural.decorator;

public class Souce extends ToppingDecorator{

    public Souce(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String description() {
        return pizza.description()+" add souce";
    }

    @Override
    public Double cost() {
        return pizza.cost() + 2.0;
    }
}
