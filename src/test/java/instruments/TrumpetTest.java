package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Thomann TR 620S", "C", "D", 4, 20, 60);
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
    public void trumpetHasAType(){
        assertEquals("C", trumpet.getType());
    }

    @Test
    public void canSetTypeOfTrumpet(){
        trumpet.setType("D");
        assertEquals("D", trumpet.getType());
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

    @Test
    public void canGetBuyingPriceofTrumpet(){
        assertEquals(20, trumpet.getBuyingPrice(), 0.02);
    }

    @Test
    public void canGetSellingPriceOfTrumpet(){
        assertEquals(60, trumpet.getSellingPrice(), 0.02);
    }

}
