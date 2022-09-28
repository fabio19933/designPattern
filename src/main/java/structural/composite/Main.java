package structural.composite;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Manager manager = new Manager();
        Director director = new Director();
        Director superDirector = new Director();
        director.addMember(developer);
        director.addMember(manager);
        superDirector.addMember(director);
        superDirector.description();
    }
}
