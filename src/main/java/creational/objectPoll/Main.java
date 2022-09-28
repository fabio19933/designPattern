package creational.objectPoll;

public class Main {
    private static ObjectPool<Product> objectPool = new ObjectPool<>(()->new Product(),2);

    public static void main(String[] args) {
        Product p1 = objectPool.get();
        Product p2 = objectPool.get();
        p1.setName("Gino");
        p2.setName("Pino");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        objectPool.reset(p1);
        objectPool.reset(p2);
        Product p3 = objectPool.get();
        System.out.println(p3.getName());
    }
}
