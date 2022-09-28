package creational.abstracFactory.model;

public class ModernFantry implements Fantry{
    private String description = "modern fantry";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ModernFantry{" +
                "description='" + description + '\'' +
                '}';
    }
}
