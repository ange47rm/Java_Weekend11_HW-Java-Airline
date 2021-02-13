import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane (PlaneType.BOEING737);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.BOEING737, plane.getType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(162, plane.getCapacity());
    }

    @Test
    public void planeHasTotalWeight(){
        assertEquals(300, plane.getTotalWeight());
    }
}
