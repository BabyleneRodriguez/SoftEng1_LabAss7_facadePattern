package SoftEng1_LabAss7_facadePattern;

public class HouseKeeping implements HotelService
{
    private String roomNumber;
    public HouseKeeping(String roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    @Override
    public void execute()
    {
        cleanRoom(roomNumber);
    }
    public void cleanRoom(String roomNumber)
    {
        System.out.println("\nOur crews will be stationed in room " +  roomNumber + ". We are happy to have you stay in a comfortable room with us.\n");
    }
}
