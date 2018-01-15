import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void Before(){
        cdPlayer = new CDPlayer("Sanyo", "CD34");
    }

    @Test
    public void canPlay(){
        assertEquals("Playing your fav track", cdPlayer.play());
    }


}
