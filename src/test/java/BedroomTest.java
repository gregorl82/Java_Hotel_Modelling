import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest2;

    @Before
    public void before(){
        bedroom1 = new Bedroom(101, 2, "double", 75.50);
        guest2 = new Guest("Emma");
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(101, bedroom1.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("double", bedroom1.getRoomType());
    }

    @Test
    public void guestListStartsEmpty(){
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void canAddGuestToRoom(){
        bedroom1.addGuest(guest2);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canEmptyRoom(){
        bedroom1.addGuest(guest2);
        bedroom1.emptyRoom();
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void checkNotOccupied(){
        assertFalse(bedroom1.occupied());
    }

    @Test
    public void checkIsOccuppied(){
        bedroom1.addGuest(guest2);
        assertTrue(bedroom1.occupied());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(75.50, bedroom1.getRate(), 0.01);
    }

    @Test public void canSetNightlyRate(){
        bedroom1.setRate(80.00);
        assertEquals(80.00, bedroom1.getRate(), 0.01);
    }
}
