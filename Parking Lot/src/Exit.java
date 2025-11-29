public class Exit {

    public static  boolean processPayment(PaymentProcessor paymentProcessor,Ticket ticket){
        int amount  = (2)*ticket.getParkingSpot().getPrice();
        return paymentProcessor.pay(amount);
    }
}
