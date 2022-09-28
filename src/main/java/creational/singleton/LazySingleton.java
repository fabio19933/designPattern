package creational.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton;

    public static LazySingleton getLazySingleton(){
        if(lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
