package structural.bridge;

import structural.bridge.abstraction.Shape;
import structural.bridge.implementation.Blue;
import structural.bridge.implementation.Square;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(new Blue());
        System.out.println(square.draw());
    }
}
