public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override
    public boolean pay(int amount) {
        System.out.println("Paying Through Card");
        return true;
    }
}
