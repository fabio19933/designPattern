package creational.builder;

public class Person {
    private String name;
    private String surname;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


    public static class PersonBuilder implements PersonBuilderI {
        private String name;
        private String surname;

        @Override
        public PersonBuilder setName(String name) {
            this.name=name;
            return this;
        }

        @Override
        public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        @Override
        public Person build() {
            Person p = new Person();
            p.name = name;
            p.surname = surname;
            return p;
        }
    }

}
