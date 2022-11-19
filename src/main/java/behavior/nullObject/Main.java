package behavior.nullObject;

public class Main {
    public static void main(String[] args) {
        FactoryPerson factoryPerson = new FactoryPerson();
        System.out.println(factoryPerson.generatePersonByName("Fabio").getName());
        System.out.println(factoryPerson.generatePersonByName("Gino").getName());
    }
}
