package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Thomann TR 620S", "D", 4);
    }

    @Test
    public void trumpetCanHaveAName(){
        assertEquals("Thomann TR 620S", trumpet.getName());
    }

    @Test
    public void canSetNameOfTrumpet(){
        trumpet.setName("Mendini by Cecilo");
        assertEquals("Mendini by Cecilo", trumpet.getName());
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
    public void canGetNumberofValvesOnATrumpet(){
        assertEquals(4, trumpet.getValves());
    }

    @Test
    public void canSetNumberOfValvesOnATrumpet(){
        trumpet.setValves(4);
        assertEquals(4, trumpet.getValves());
    }

}
