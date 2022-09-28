package creational.abstracFactory.model;

public class ModernShip implements Ship{
    private String description = "modern ship";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ModernShip{" +
                "description='" + description + '\'' +
                '}';
    }
}
