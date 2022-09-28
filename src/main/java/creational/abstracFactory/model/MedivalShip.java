package creational.abstracFactory.model;

public class MedivalShip implements Ship{
    private String description = "medival ship";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MedivalShip{" +
                "description='" + description + '\'' +
                '}';
    }
}
