package creational.singleton;

public class Main {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        EagerSingleton eagerSingleton = EagerSingleton.getEagerSingleton();
        LazySingleton lazySingleton1 = LazySingleton.getLazySingleton();
        EagerSingleton eagerSingleton1 = EagerSingleton.getEagerSingleton();
        System.out.println(lazySingleton==lazySingleton1);
        System.out.println(eagerSingleton==eagerSingleton1);
    }
}
