import java.util.List;

public class ParkingFloor {
    private int size;
    private int floorNumber;
    private List<ParkingSpot>parkingSpots;

    public ParkingFloor(int size,int floorNumber){
        this.floorNumber = floorNumber;
        this.size =size;
        init();
    }
    private void init(){

        for(int i=0;i<size/2;i++){
            parkingSpots.add(new CompactParkingSpot(i,this.floorNumber,100));
        }
        for (int i=size/2;i<size;i++){

            parkingSpots.add(new ElectricParkingSpot(i,floorNumber,200));
        }
    }


    public ParkingSpot getParkingSpot(String type){

        for(ParkingSpot parkingSpot: parkingSpots){
            if(parkingSpot.getType() == type && parkingSpot.isAvailable==true)return  parkingSpot;
        }
        return null;


    }



}
