public class ThresholdReplenishmentStrategy  implements ReplenishmentStrategy{

    @Override
    public void doReplenishment(Product product) {
        System.out.println("ThresholdReplenishmentStrategy Applied");
        product.setQuantity(product.getQuantity()+(product.getThresholdQuantity())-product.getQuantity());
    }
}
