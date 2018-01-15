import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void Before(){
        radio = new Radio("Sony", "R2");
    }

    @Test
    public void canTune(){
        assertEquals("Radio1", radio.tune());
    }
}
