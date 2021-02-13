import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Angelo", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Angelo", passenger.getName());
    }

    @Test
    public void passengerHasNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
