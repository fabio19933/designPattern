package behavior.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcrateMediator();
        AbstractUser user1 = new User("Pippo", mediator);
        AbstractUser user2 = new User("Pluto", mediator);
        AbstractUser user3 = new User("Paperino", mediator);
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        user1.send("ciao a tutti");
    }
}
