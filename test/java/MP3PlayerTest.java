import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3PlayerTest {

    Stereo stereo;
    MP3Player mp3Player;

    @Before
    public void Before(){
        stereo = new Stereo("Sony", "WLKMN1", "Trevor");
        mp3Player = new MP3Player ("MyMP3");

    }

    @Test
    public void canConnect(){
        assertEquals("MyMP3 is connected to Trevor", mp3Player.connect(stereo));
    }


}
