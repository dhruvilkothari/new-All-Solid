import java.util.Date;
import java.util.UUID;

public class Booking {
    private final String id;
    private String rentalStoreId;
    private Vehicle vehicle;
    private BookingStatus bookingStatus;
    private int price;
    private Date startDate;
    private Date endDate;
    private String user_id;

    public Booking(String rentalStoreId, Vehicle vehicle, int price, Date startDate, Date endDate, BookingStatus bookingStatus, String user_id) {
        this.rentalStoreId = rentalStoreId;
        this.vehicle = vehicle;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bookingStatus = bookingStatus;
        this.id = UUID.randomUUID()
                .toString();
        this.user_id = user_id;
    }

    public String getId() {
        return id;
    }

    public String getRentalStoreId() {
        return rentalStoreId;
    }

    public void setRentalStoreId(String rentalStoreId) {
        this.rentalStoreId = rentalStoreId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getUserId() {
        return this.user_id;
    }
}
