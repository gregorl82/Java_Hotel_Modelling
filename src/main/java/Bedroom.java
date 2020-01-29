import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String roomType;
    private ArrayList<Guest> guests;
    private double rate;

    public Bedroom(int roomNumber, int capacity, String roomType, double rate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.guests = new ArrayList<>();
        this.rate = rate;
    }

    public double getRate() {
        return rate;
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

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int guestCount(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        if (hasSpace()) {
            this.guests.add(guest);
        }
    }

    public void emptyRoom(){
        this.guests.clear();
    }

    public boolean occupied(){
        return this.guests.size() > 0;
    }

    public boolean hasSpace(){
        return this.guestCount() < this.capacity;
    }

}
