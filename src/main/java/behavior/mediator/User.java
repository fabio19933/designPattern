package behavior.mediator;

import java.util.List;

public class User extends AbstractUser{
    public User(String userName, Mediator mediator) {
        super(userName, mediator);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void recive(String msg) {
        System.out.println(userName + " recived message " +msg);
    }
}
