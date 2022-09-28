package creational.abstracFactory.factory;

public class MakeFactory {
    public enum TypeFactory{
        MEDIVAL,
        MODERN;
    }
    public static Factory makeFactory(TypeFactory type){
        switch (type){
            case MEDIVAL:
                return new MedivalFactory();
            case MODERN:
                return new ModernFactory();
            default:
                throw new RuntimeException();
        }
    }
}
