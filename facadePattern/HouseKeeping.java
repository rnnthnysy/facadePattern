package facadePattern;

public class HouseKeeping implements HotelService{
    private String roomNumber;

    public HouseKeeping(String roomNumber){
        this.roomNumber = roomNumber;
    }
    @Override
    public void executeService() {
        cleanRoom(roomNumber);
    }
    public void cleanRoom(String roomNumber){
        System.out.println("Housekeeper proceeding to " + roomNumber + " room number");
    }
}