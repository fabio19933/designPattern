package behavior.mediator;

public abstract class AbstractUser {
    protected String userName;
    protected Mediator mediator;

    public AbstractUser(String userName, Mediator mediator) {
        this.userName = userName;
        this.mediator = mediator;
    }

    public abstract void send(String msg);
    public abstract void recive(String msg);
}
