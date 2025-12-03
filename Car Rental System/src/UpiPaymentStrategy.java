public class UpiPaymentStrategy implements PaymentStrategy{
    @Override
    public boolean pay(int amount) {
        System.out.println(
                "Payment Done through Upi "+ amount
        );
        return true;
    }
}
