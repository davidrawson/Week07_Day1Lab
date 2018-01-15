import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    Radio radio;
    CDPlayer cdPlayer;

    @Before
    public void Before(){
        stereo = new Stereo("Sony", "WLKMN1", "Trevor");
    }


//    @Test
//    public void canConnect(){
//        assertEquals("Connected to Trevor", stereo.connect());
//    }


}
