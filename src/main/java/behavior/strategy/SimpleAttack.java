package behavior.strategy;

public class SimpleAttack implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Simple attack");
    }
}
