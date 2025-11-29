import java.util.List;

public class ParkingLot {
    private PaymentProcessor paymentProcessor;
    private List<ParkingFloor>parkingFloors;

    public ParkingLot(PaymentProcessor paymentProcessor, List<ParkingFloor>parkingFloors){
        this.parkingFloors = parkingFloors;
        this.paymentProcessor = paymentProcessor;
    }
    public Ticket getParkingSpot(ParkingSpot parkingSpot){
        Ticket t = Entrance.getTicket(parkingFloors,parkingSpot);
        if(t==null)return null;
        return t;
    }
    public boolean getPayment(Ticket  t){
       return Exit.processPayment(paymentProcessor,t);
    }

}
