package behavior.template;

public abstract class Sandwich {

    public void makeSandwich(){
        cutBread();
        putHam();
        putCheese();
        wrapBread();
    }


    abstract void putCheese();

    abstract void putHam();

    private void wrapBread(){
        System.out.println("bread wrapped");
    }

    private void cutBread(){
        System.out.println("bread cutted");
    }

}
