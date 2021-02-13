import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Luigi", RankType.FLIGHTATTENDANT);
    }

    @Test
    public void cabinCrewHasRank(){
        assertEquals(RankType.FLIGHTATTENDANT, cabinCrew.getRank());
    }
}
