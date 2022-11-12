package behavior.template;

public class Classic extends Sandwich{

    @Override
    void putCheese() {
        System.out.println("put cheese");
    }

    @Override
    void putHam() {
        System.out.println("put ham");
    }
}
