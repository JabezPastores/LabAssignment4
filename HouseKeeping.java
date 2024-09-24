public class HouseKeeping implements HotelService{
    public void cleanRoom(int roomNumber){
        System.out.println("The maid is cleaning room number: " + roomNumber);
    }
    @Override
    public void performService(){
        //Can I leave it blank?
    }
}