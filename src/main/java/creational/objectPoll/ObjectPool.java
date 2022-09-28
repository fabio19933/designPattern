package creational.objectPoll;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool <T extends Poolable>{
    private BlockingQueue<T> blockingDeque;

    public ObjectPool(Supplier<T> supplier, int number) {
        blockingDeque = new LinkedBlockingQueue<>();
        for (int i=0; i<number; i++){
            blockingDeque.offer(supplier.get());
        }
    }

    public T get(){
        try {
           return blockingDeque.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void reset(T obj){
        obj.reset();
        try {
            blockingDeque.put(obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
