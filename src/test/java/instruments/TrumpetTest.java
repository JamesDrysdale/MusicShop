package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("D", 4);
    }

    @Test
    public void trumpetCanPlaySound(){
        trumpet.play();
        assertEquals("D", trumpet.play());
    }

    @Test
    public void trumpetCanChooseOtherSoundsToPlay(){
        trumpet.chooseSounds("C");
        trumpet.makeSound();
        assertEquals("C", trumpet.makeSound());
    }

    @Test
    public void trumpetHas4Valves(){
        assertEquals(4, trumpet.valveCount());
    }

}
