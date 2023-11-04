package facadePattern;
import java.util.Scanner;
public class HotelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FrontDesk frontDesk = new FrontDesk();

        System.out.println("Simplified Hotel Management System");

        while (true) {
            System.out.println("Please select a service: ");
            System.out.println("(1) Valet Service");
            System.out.println("(2) HouseKeeping Service");
            System.out.println("(3) Cart Service");
            System.out.println("(4) Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter the plate number of your vehicle: ");
                    String plateNumber = scanner.nextLine();
                    HotelService valet = new Valet(plateNumber);
                    frontDesk.doService(valet);
                    break;

                case "2":
                    System.out.println("Enter room number for house keeping service: ");
                    String roomNumber = scanner.nextLine();
                    HotelService houseKeeping = new HouseKeeping(roomNumber);
                    frontDesk.doService(houseKeeping);
                    break;

                case "3":
                    try {
                        System.out.println("Enter the number of cart/s that is needed for your luggage: ");
                        int numberOfCarts = scanner.nextInt();
                        scanner.nextLine();
                        HotelService cart = new Cart(numberOfCarts);
                        frontDesk.doService(cart);
                        break;
                    }
                    catch (Exception e){
                        System.out.println("Invalid Input");
                        System.out.println("Please Try Again");
                        scanner.nextLine();
                    }
                    break;

                case "4":
                    System.out.println("Thank you for using Hotel Service app!");
                    System.out.println("Exiting program....");
                    System.exit(0);
                    break;

                default :
                    System.out.println("Invalid Input!");
                    System.out.println("Please Try Again");
                    break;
            }
        }
    }
}