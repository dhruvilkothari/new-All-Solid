public abstract class ParkingSpot {
    public int spotNumber;
    public int price;
    public Vehicle vehicle;
    public int floorNumber;
    boolean isAvailable;
    private String type;

    public ParkingSpot(int spotNumber, int floorNumber, int price, String type) {
        this.spotNumber = spotNumber;
        this.price = price;
        this.vehicle = null;
        this.isAvailable = true;
        this.floorNumber = floorNumber;
        this.type = type;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
