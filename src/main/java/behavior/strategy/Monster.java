package behavior.strategy;

public class Monster {
    private AttackStrategy attackStrategy;

    public Monster(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack(){
        attackStrategy.attack();
    }
    public void setStrategy(AttackStrategy attackStrategy){
        this.attackStrategy = attackStrategy;
    }
}
