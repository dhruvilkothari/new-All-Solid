import java.util.UUID;

public class Vehicle {
    private final String id;
    private String name;
    private Boolean isAvailable;
    private int basePrice;

    public Vehicle(String name, int basePrice) {
        this.name = name;
        id = UUID.randomUUID().toString();
        this.basePrice = basePrice;
        isAvailable = true;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
    public int getBasePrice(){return this.basePrice;}
}
