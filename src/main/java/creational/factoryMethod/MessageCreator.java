package creational.factoryMethod;

public abstract class MessageCreator {

    public Message getMessage(){
        return createMessage();
    }

    protected abstract Message createMessage();
}
