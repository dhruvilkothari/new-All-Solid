import java.util.UUID;

public class Product {
    private final String id;
    private String name;
    int quantity;
    int thresholdQuantity;

    public Product(String name, int quantity, int thresholdQuantity) {
        this.name = name;
        this.quantity = quantity;
        this.thresholdQuantity = thresholdQuantity;
        this.id = UUID.randomUUID().toString();
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getThresholdQuantity() {
        return thresholdQuantity;
    }

    public void setThresholdQuantity(int thresholdQuantity) {
        this.thresholdQuantity = thresholdQuantity;
    }
}
