package creational.prototype;

public interface Product extends Cloneable{
    Product makeCopy() throws CloneNotSupportedException;
}
