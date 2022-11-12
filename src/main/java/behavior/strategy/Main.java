package behavior.strategy;

public class Main {
    public static void main(String[] args) {
        Monster monster = new Monster(new SimpleAttack());
        monster.attack();
        monster.setStrategy(new PowerAttack());
        monster.attack();
    }
}
