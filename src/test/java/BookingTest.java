import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookingTest {

    private Booking booking1;
    private Bedroom bedroom1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(101, 2, "double", 75.50);
        booking1 = new Booking(bedroom1, 3);
    }

    @Test
    public void hasBedroom(){
        assertEquals(bedroom1, booking1.getBedroom());
    }

    @Test
    public void hasNumberOfNights(){
        assertEquals(3, booking1.getNights());
    }

    @Test
    public void canCalculateTotalBill(){
        assertEquals(226.50, booking1.calculateBill(), 0.01);
    }
}
