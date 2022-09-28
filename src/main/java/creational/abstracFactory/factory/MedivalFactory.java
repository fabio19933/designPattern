package creational.abstracFactory.factory;

import creational.abstracFactory.model.Fantry;
import creational.abstracFactory.model.MedivalFantry;
import creational.abstracFactory.model.MedivalShip;
import creational.abstracFactory.model.Ship;

public class MedivalFactory implements Factory{
    @Override
    public Ship createShip() {
        return new MedivalShip();
    }

    @Override
    public Fantry createFantry() {
        return new MedivalFantry();
    }
}
