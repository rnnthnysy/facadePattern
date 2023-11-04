package facadePattern;

public class FrontDesk {
    public void doService(HotelService hotelService){
        hotelService.executeService();
    }
}