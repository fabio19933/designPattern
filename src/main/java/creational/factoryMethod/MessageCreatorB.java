package creational.factoryMethod;

public class MessageCreatorB extends MessageCreator{
    @Override
    protected Message createMessage() {
        return new MessageB();
    }
}
