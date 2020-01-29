import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConferenceRoomTest {

    private ConferenceRoom conRoom1;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        conRoom1 = new ConferenceRoom("The Lomond Suite", 3);
        guest1 = new Guest("Gregor");
        guest2 = new Guest("Emma");
    }

    @Test
    public void hasName(){
        assertEquals("The Lomond Suite", conRoom1.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, conRoom1.getCapacity());
    }

    @Test
    public void guestListStartsEmpty(){
        assertEquals(0, conRoom1.guestCount());
    }

    @Test
    public void canAddGuest(){
        conRoom1.addGuest(guest1);
        assertEquals(1, conRoom1.guestCount());
    }

    @Test
    public void canEmptyRoom(){
        conRoom1.addGuest(guest1);
        conRoom1.addGuest(guest2);
        conRoom1.emptyRoom();
        assertEquals(0, conRoom1.guestCount());
    }

    @Test
    public void checkIsOccupied(){
        conRoom1.addGuest(guest1);
        conRoom1.addGuest(guest2);
        assertTrue(conRoom1.occupied());
    }

    @Test
    public void checkNotOccupied(){
        assertFalse(conRoom1.occupied());
    }

}
