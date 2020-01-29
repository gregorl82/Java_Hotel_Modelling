import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.conRooms = conRooms;
    }

    public String getName() {
        return name;
    }

    public int bedroomCount(){
        return this.bedrooms.size();
    }

    public int conRoomCount(){
        return this.conRooms.size();
    }

    public void checkInBedroom(Bedroom bedroom, Guest guest){
        if (this.bedrooms.contains(bedroom) && !bedroom.occupied()){
            bedroom.addGuest(guest);
        }
    }

    public void checkInConRoom(ConferenceRoom conRoom, Guest guest){
        if (this.conRooms.contains(conRoom) && !conRoom.occupied()){
            conRoom.addGuest(guest);
        }
    }

    public void checkOutBedroom(Bedroom bedroom){
        if (this.bedrooms.contains(bedroom)){
            bedroom.emptyRoom();
        }
    }

    public void checkOutConRoom(ConferenceRoom conRoom){
        if (this.conRooms.contains(conRoom)){
            conRoom.emptyRoom();
        }
    }
}
