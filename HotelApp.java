public class HotelApp {
    public static void main(String[]args){
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestHouseKeeping(235);
        frontDesk.requestCart(3);
        frontDesk.requestValet("ARA213");
    }
}