package structural.bridge.implementation;

import structural.bridge.abstraction.Color;
import structural.bridge.abstraction.Shape;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "create a rectangle with color " + color.fill();
    }

}
