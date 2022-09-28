package structural.decorator;

public class Mozzarella extends ToppingDecorator{
    public Mozzarella(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String description() {
        return pizza.description()+" add Mozzarella";
    }

    @Override
    public Double cost() {
        return pizza.cost()+ 1.0;
    }
}
