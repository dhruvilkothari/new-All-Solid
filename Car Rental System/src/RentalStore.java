import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class RentalStore {
    private String id;
    private List<Vehicle>vehicles;
    private HashMap<String, Booking> bookings;

    public RentalStore(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
        bookings = new HashMap<>();
        this.id = UUID.randomUUID().toString();
    }



    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public HashMap<String, Booking> getBookings() {
        return bookings;
    }

    public void setBookings(HashMap<String, Booking> bookings) {
        this.bookings = bookings;
    }

    public Vehicle findAvailableVehicle() {

        for(Vehicle vehicle: vehicles){
            if(vehicle.getAvailable())return vehicle;
        }
        return null;
    }

    public Booking doBooking(Vehicle vehicle, User user, Date startDate, Date endDate) {
        synchronized (vehicle){
            if(vehicle.getAvailable()==false)return  null;
            vehicle.setAvailable(false);
            int price = vehicle.getBasePrice()+2*(startDate.getDate()-endDate.getDate());
            Booking booking = new Booking(this.id,vehicle,price,startDate,endDate,BookingStatus.CONFIRMED, user.getId());
            return booking;
        }
    }

    public void addBooking(Booking booking) {
        this.bookings.put(booking.getUserId(),booking);
    }
}
