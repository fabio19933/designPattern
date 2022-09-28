package structural.flyweight;

import java.util.LinkedHashMap;
import java.util.Map;

public class VehicleFactory {
    private Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();

    private final static VehicleFactory VEICLE_FACTORY = new VehicleFactory();

    public static VehicleFactory getInstance(){
        return VEICLE_FACTORY;
    }
    private VehicleFactory(){
        vehicleMap.put("truck", new Truck("120kg"));
    }
    public Vehicle getVeicle(String key){
        return vehicleMap.get(key);
    }
}
