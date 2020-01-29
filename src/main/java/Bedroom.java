import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String roomType;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, int capacity, String roomType) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public int guestCount(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void emptyRoom(){
        this.guests.clear();
    }

    public boolean occupied(){
        return this.guests.size() > 0;
    }



}
