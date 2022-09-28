package creational.abstracFactory;

import creational.abstracFactory.factory.Factory;
import creational.abstracFactory.factory.MakeFactory;
import creational.abstracFactory.factory.MakeFactory.TypeFactory;
import creational.abstracFactory.model.Fantry;
import creational.abstracFactory.model.Ship;

public class Main {
    public static void main(String[] args) {
        Factory modernFactory = MakeFactory.makeFactory(TypeFactory.MODERN);
        Factory medivalFactory = MakeFactory.makeFactory(TypeFactory.MEDIVAL);
        Fantry modernFantry =  modernFactory.createFantry();
        Ship modernShip = modernFactory.createShip();
        Fantry medivalFantry = medivalFactory.createFantry();
        Ship medivalShip = medivalFactory.createShip();
        System.out.println("this is " + modernFantry.getDescription());
        System.out.println("this is " + modernShip.getDescription());
        System.out.println("this is " + medivalFantry.getDescription());
        System.out.println("this is " + medivalShip.getDescription());
    }
}
