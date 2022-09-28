package creational.abstracFactory.factory;

import creational.abstracFactory.model.Fantry;
import creational.abstracFactory.model.ModernFantry;
import creational.abstracFactory.model.ModernShip;
import creational.abstracFactory.model.Ship;

public class ModernFactory implements Factory{
    @Override
    public Ship createShip() {
        return new ModernShip();
    }

    @Override
    public Fantry createFantry() {
        return new ModernFantry();
    }
}
