package creational.singleton;

public class EagerSingleton {
    private final static EagerSingleton EAGER_SINGLETON = new EagerSingleton();

    public static EagerSingleton getEagerSingleton(){
        return EAGER_SINGLETON;
    }

}
