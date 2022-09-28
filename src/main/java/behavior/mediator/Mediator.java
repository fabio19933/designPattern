package behavior.mediator;

public interface Mediator {

    void addUser(AbstractUser user);
    void send(String msg, User user);
}
