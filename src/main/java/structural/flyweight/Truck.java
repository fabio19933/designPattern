package structural.flyweight;

public class Truck implements Vehicle {
    private String color;
    private String weight;

    public Truck(String weight) {
        this.weight = weight;
    }

   public void setColor(String color){
        this.color=color;
   }

    @Override
    public String toString() {
        return "Truck{" +
                "color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
