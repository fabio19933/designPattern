package structural.bridge.implementation;

import structural.bridge.abstraction.Color;

public class Blue implements Color {
    @Override
    public String fill() {
        return "blue";
    }
}
