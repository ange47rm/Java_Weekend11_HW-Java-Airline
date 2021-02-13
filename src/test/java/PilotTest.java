import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before (){
        pilot = new Pilot ("Angelo", RankType.CAPTAIN, "ABC123LICNO");
    }

    @Test
    public void pilotHasCaptainRank(){
        assertEquals(RankType.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicenseNumber(){
        assertEquals("ABC123LICNO", pilot.getLicenseNumber());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("The plane takes off and flies away...", pilot.flyPlane());
    }

}
