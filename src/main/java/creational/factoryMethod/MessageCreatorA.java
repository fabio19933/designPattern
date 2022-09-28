package creational.factoryMethod;

public class MessageCreatorA extends MessageCreator{
    @Override
    protected Message createMessage() {
        return new MessageA();
    }
}
