package SoftEng1_LabAss7_facadePattern;

public class Valet implements HotelService
{
    private String plateNumber;
    public Valet(String plateNumber)

    {
        this.plateNumber = plateNumber;
    }

    @Override
    public void execute()
    {
        pickUpVehicle(plateNumber);
    }
    public void pickUpVehicle(String plateNumber)
    {
        System.out.println("\nWe will pick up your vehicle with the plate number " + plateNumber + " right away.");
    }
}
