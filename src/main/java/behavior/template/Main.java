package behavior.template;

public class Main {
    public static void main(String[] args) {
        Sandwich vegetarian = new Vegetarian();
        Sandwich classic = new Classic();
        vegetarian.makeSandwich();
        classic.makeSandwich();
    }
}
