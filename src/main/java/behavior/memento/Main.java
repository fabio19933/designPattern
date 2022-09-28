package behavior.memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setValue("test 1");
        careTaker.addMementoToList(originator.saveMemento());
        originator.setValue("test 2");
        careTaker.addMementoToList(originator.saveMemento());
        originator.getValueFromMemento(careTaker.getMemento(0));
        System.out.println(originator.getValue());
        originator.getValueFromMemento(careTaker.getMemento(1));
        System.out.println(originator.getValue());
    }
}
