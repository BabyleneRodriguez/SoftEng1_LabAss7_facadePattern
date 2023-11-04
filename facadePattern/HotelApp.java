package SoftEng1_LabAss7_facadePattern;

import java.util.Scanner;

public class HotelApp
{
    public static void main (String args[])
    {
        System.out.println("SOFTWARE ENGINEERING 1");
        System.out.print("LABORATORY ASSIGNMENT 7 - FACADE PATTERN\n");
        System.out.print("RODRIGUEZ, BABYLENE G.\n");
        System.out.print("3-BSCS-1\n");
        System.out.println();

        while(true)
        {
            Scanner usersInput = new Scanner(System.in);
            System.out.println("\n\n~ Hotel Services ~");
            System.out.print("\nWhat can I do to assist you?\n\n"
                    + "[1] Valet    "
                    + "[2] HouseKeeping   "
                    + "[3] Cart     "
                    + "[4] Exit\n"
                    + "\n\nPlease select one of the following options: ");
            int choice = usersInput.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("\nKindly enter the plate number of your vehicle: ");
                    String plateNumber = usersInput.next();
                    HotelService valet = new Valet(plateNumber); FrontDesk.performTask(valet);
                    break;
                case 2:
                    System.out.print("\nKindly enter your room number: ");
                    String roomNumber = usersInput.next();
                    HotelService houseKeeping = new HouseKeeping(roomNumber); FrontDesk.performTask(houseKeeping);
                    break;
                case 3:
                    System.out.print("\nKindly enter the number of cart/s that you need: ");
                    int numberOfCarts = usersInput.nextInt();
                    HotelService cart = new Cart(numberOfCarts); FrontDesk.performTask(cart);
                    break;
                case 4:
                    System.out.println("\nEXITING PROGRAM...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nThis is not a valid Option! Please Select Another");
                    break;
            }
        }
    }
}
