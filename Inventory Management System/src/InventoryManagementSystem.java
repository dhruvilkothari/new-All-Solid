import java.util.List;

public class InventoryManagementSystem {
    private static InventoryManagementSystem instance;
    private List<Warehouse>warehouses;
    private InventoryManagementSystem(List<Warehouse>warehouses){
        this.warehouses = warehouses;
    }
    public static  InventoryManagementSystem getInstance(List<Warehouse>warehouses){
        synchronized (InventoryManagementSystem.class){
            if(instance == null){
                instance = new InventoryManagementSystem(warehouses);
            }return instance;
        }
    }
    public void timelyReplishment(){
        for(Warehouse warehouse: warehouses){
            List<Product> products = warehouse.getProducts();
            for(Product product:products){
                if(product.getQuantity() <product.getThresholdQuantity()){
                    warehouse.replish(product);
                }
            }
        }
    }





}
