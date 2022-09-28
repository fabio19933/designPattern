package creational.abstracFactory.factory;

import creational.abstracFactory.model.Fantry;
import creational.abstracFactory.model.Ship;

public interface Factory {
    Ship createShip();
    Fantry createFantry();
}
