import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle();
    }

    @Test
    public void bottle_volume_starts_at_100(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void can_remove_10_from_volume(){
        bottle.takeSip();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void can_empty_water_bottle(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void can_fill_water_bottle(){
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }

}
