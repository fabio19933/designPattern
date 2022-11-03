package creational.builder;

public class Main {
    //Pattern creational.builder serve per costruire un oggetto con molti attributi e per sgravare il client di ricordarsi ogni singola posizione di ogni singolo attributo da settare
    public static void main(String[] args) {
        PersonBuilderI builder = new Person.PersonBuilder();
        Person person = builder.setName("Stefano").setSurname("Rossi").build();
        System.out.println(person);
    }
}
