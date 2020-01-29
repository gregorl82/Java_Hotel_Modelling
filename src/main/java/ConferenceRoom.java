import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
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
