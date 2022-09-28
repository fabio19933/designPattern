package creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Message msgA = createMessage(new MessageCreatorA());
        System.out.println(msgA.getMessage());
        Message msgB = createMessage(new MessageCreatorB());
        System.out.println(msgB.getMessage());
    }

    private static Message createMessage(MessageCreator messageCreator) {
        return messageCreator.createMessage();
    }
}
