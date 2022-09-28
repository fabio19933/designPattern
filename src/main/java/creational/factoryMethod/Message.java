package creational.factoryMethod;

public abstract class Message {
    private String message;

    public abstract String getMessage();

    public void setMessage(String message) {
        this.message = message;
    }
}
