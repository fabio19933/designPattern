package creational.abstracFactory.model;

public class MedivalFantry implements Fantry{
    private String description = "medival fantry";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MedivalFantry{" +
                "description='" + description + '\'' +
                '}';
    }
}
