import java.util.List;

public class Warehouse {
    private List<Product>products;
    private ReplenishmentStrategy replenishmentStrategy;

    public Warehouse(List<Product>products, ReplenishmentStrategy replenishmentStrategy){
        this.products = products;
        this.replenishmentStrategy =replenishmentStrategy;
    }
    public void addProduct(Product product, int quantity){

    }
    public void removeProduct(Product product,int quantity){

    }
    public void replish(Product product){
        replenishmentStrategy.doReplenishment(product);
    }

    public List<Product> getProducts() {
        return this.products;
    }
}

