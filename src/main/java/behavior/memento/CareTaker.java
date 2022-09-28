package behavior.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memento> mementoList = new ArrayList<>();
    public void addMementoToList(Memento memento){
        mementoList.add(memento);
    }
    public Memento getMemento(int i ){
        return mementoList.get(i);
    }
}
