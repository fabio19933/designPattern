package creational.builder;

public interface PersonBuilderI {
    Person.PersonBuilder setName(String name);
    Person.PersonBuilder setSurname(String surname);
    Person build();
}
