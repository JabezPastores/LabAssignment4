public class FrontDesk {
    private Valet valet;
    private HouseKeeping housekeeping;
    private Cart cart;

    public FrontDesk(){
        valet = new Valet();
        housekeeping = new HouseKeeping();
        cart = new Cart();

    }

    public void requestValet(String plateNumber){
        valet.pickUpVehicle(plateNumber);
    }
    public void requestHouseKeeping(int roomNumber){
        housekeeping.cleanRoom(roomNumber);
    }
    public void requestCart(int numberOfCarts){
        cart.requestCart(numberOfCarts);
    }
}