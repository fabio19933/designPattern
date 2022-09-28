package behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcrateMediator implements Mediator{
    private List<AbstractUser> abstractUserList;

    public ConcrateMediator() {
        this.abstractUserList = new ArrayList<>();
    }

    @Override
    public void addUser(AbstractUser user) {
        abstractUserList.add(user);
    }

    @Override
    public void send(String msg, User user) {
        abstractUserList.iterator();
        abstractUserList.stream().filter(reciverUser -> reciverUser != user).forEach( reciverUser -> reciverUser.recive(msg));
    }
}
