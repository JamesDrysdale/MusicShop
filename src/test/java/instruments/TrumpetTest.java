package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet();
    }

    @Test
    public void trumpetCanPlaySound(){
        trumpet.play();
        assertEquals("D", trumpet.play("D"));
    }

}
