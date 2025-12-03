import java.util.Date;
import java.util.List;

public class VehicleRentalSystem {
    private static VehicleRentalSystem vehicleRentalSystem;
    private List<RentalStore>rentalStores;
    private PaymentStrategy paymentStrategy;

    private VehicleRentalSystem(List<RentalStore>rentalStores, PaymentStrategy paymentStrategy){
        this.rentalStores = rentalStores;

        this.paymentStrategy = paymentStrategy;
    }

    public static VehicleRentalSystem getInstance(List<RentalStore>rentalStores, PaymentStrategy paymentStrategy){
        synchronized (VehicleRentalSystem.class){
            if(vehicleRentalSystem == null){
                vehicleRentalSystem = new VehicleRentalSystem(rentalStores,paymentStrategy);
            }
            return vehicleRentalSystem;
        }
    }

    public Vehicle findAvailableVehicle(RentalStore store){
        return store.findAvailableVehicle();
    }

    public Booking doBookingForVehicle(Vehicle vehicle, RentalStore rentalStore, User user, Date startDate,Date endDate){

        Booking booking =  rentalStore.doBooking(vehicle, user,startDate, endDate);
        paymentStrategy.pay(booking.getPrice());
        rentalStore.addBooking(booking);
        return booking;
    }


}
