package SoftEng1_LabAss7_facadePattern;

public class FrontDesk
{
    public static void performTask (HotelService service)
    {
        service.execute();
    }
}
