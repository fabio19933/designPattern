package structural.bridge.implementation;

import structural.bridge.abstraction.Color;
import structural.bridge.abstraction.Shape;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "create a square with color " + color.fill();
    }
}
