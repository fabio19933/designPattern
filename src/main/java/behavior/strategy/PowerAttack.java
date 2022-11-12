package behavior.strategy;

public class PowerAttack implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Power Attack");
    }
}
