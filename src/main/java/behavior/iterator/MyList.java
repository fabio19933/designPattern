package behavior.iterator;

import java.util.Arrays;

public class MyList<T> implements Iterator {

    private T[] list = (T[]) new Object[0];
    private int cursor = 0;


    @Override
    public boolean hasNext() {
        if(cursor < list.length){
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if(cursor < list.length){
            return list[cursor++];
        }
            return null;
    }
    public void add(T element){
        list = Arrays.copyOf(list, list.length + 1);
        list[list.length-1] = element;
    }
}
