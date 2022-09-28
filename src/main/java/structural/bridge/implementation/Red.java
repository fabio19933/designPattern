package structural.bridge.implementation;

import structural.bridge.abstraction.Color;

public class Red implements Color {
    @Override
    public String fill() {
        return "red";
    }
}
