package behavior.template;

public class Vegetarian extends Sandwich{

    @Override
    void putCheese() {
        System.out.println("put cheese");
    }

    @Override
    void putHam() {
        System.out.println("no ham added, it is a vegetarian sandwich");
    }
}
