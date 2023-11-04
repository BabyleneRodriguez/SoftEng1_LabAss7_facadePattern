package SoftEng1_LabAss7_facadePattern;

public class Cart implements HotelService
{
    private int numberOfCarts;
    public Cart(int numberOfCarts)
    {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void execute()
    {
        requestCart(numberOfCarts);
    }
    public void requestCart(int numberOfCarts)
    {
        System.out.println("\n" + numberOfCarts + " carts will be coming...\n");
    }
}
