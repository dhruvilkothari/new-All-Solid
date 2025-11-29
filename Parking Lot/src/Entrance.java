import java.util.List;

public class Entrance {

    public static Ticket getTicket(List<ParkingFloor>parkingFloors, ParkingSpot parkingSpot){
        ParkingSpot parkingSpot1 = null;


        for(int i=0;i<parkingFloors.size();i++){
            ParkingFloor p1 = parkingFloors.get(i);
            parkingSpot1 = p1.getParkingSpot(parkingSpot.getType());
            if(parkingSpot1!=null)break;
        }
        if(parkingSpot1==null)return null;
        parkingSpot1.setAvailable(false);
        Ticket ticket =new Ticket(parkingSpot);
        return ticket;
    }
}
