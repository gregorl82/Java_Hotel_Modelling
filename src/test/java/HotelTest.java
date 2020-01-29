import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conRoom1;
    private ConferenceRoom conRoom2;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        bedroom1 = new Bedroom(101, 2, "double");
        bedroom2 = new Bedroom(102, 1, "single");
        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        conRoom2 = new ConferenceRoom("Monarch of the Glen", 3);
        conRoom1 = new ConferenceRoom("The Lomond Suite", 3);
        ArrayList<ConferenceRoom> conRooms = new ArrayList<>();
        conRooms.add(conRoom1);
        conRooms.add(conRoom2);
        hotel = new Hotel("CodeClan Towers", bedrooms, conRooms);
        guest1 = new Guest("Gregor");
        guest2 = new Guest("Emma");
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void hasBedrooms(){
        assertEquals(2, hotel.bedroomCount());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(2, hotel.conRoomCount());
    }

    @Test
    public void canCheckGuestInBedroom(){
        hotel.checkInBedroom(bedroom1, guest1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canCheckGuestInConRoom(){
        hotel.checkInConRoom(conRoom1, guest2);
        assertEquals(1, conRoom1.guestCount());
    }

    @Test
    public void canCheckGuestsOutBedroom(){
        hotel.checkInBedroom(bedroom1, guest1);
        hotel.checkOutBedroom(bedroom1);
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void canCheckGuestsOutConRoom(){
        hotel.checkInConRoom(conRoom1, guest2);
        hotel.checkOutConRoom(conRoom1);
        assertEquals(0, conRoom1.guestCount());
    }
}
