package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        Truck truck = (Truck) VehicleFactory.getInstance().getVeicle("truck");
        truck.setColor("red");
        System.out.println(truck);
        Truck truck2 = (Truck) VehicleFactory.getInstance().getVeicle("truck");
        System.out.println(truck2);
        System.out.println(truck==truck2);
    }
}
