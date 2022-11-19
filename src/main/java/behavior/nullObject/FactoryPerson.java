package behavior.nullObject;

public class FactoryPerson {
    public AbstractPerson generatePersonByName(String name){
        switch (name){
            case "Fabio":
            case "Pippo":
              return new Person(name);
            default:
                return new NullPerson();
        }
    }
}
