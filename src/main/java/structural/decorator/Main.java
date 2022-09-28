package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Souce(new Mozzarella(new SimplePizza()));
        System.out.println(pizza.cost());
        System.out.println(pizza.description());
    }
}
