package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {
    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Selmer Bass SA80", "Alto","A C B C A", 88, 45, 95);
    }

    @Test
    public void saxophoneCanHaveAName(){
        assertEquals("Selmer Bass SA80", saxophone.getName());
    }

    @Test
    public void canSetSaxophoneName(){
        saxophone.setName("Yamaha YAS-62 Professional Alto");
        assertEquals("Yamaha YAS-62 Professional Alto", saxophone.getName());
    }

    @Test
    public void saxophoneHasAType(){
        assertEquals("Alto", saxophone.getType());
    }

    @Test
    public void canSetTypeOfSaxophone(){
        saxophone.setType("Soprano");
        assertEquals("Soprano", saxophone.getType());
    }

    @Test
    public void saxophoneCanPlaySound(){
        saxophone.play();
        assertEquals("A C B C A", saxophone.play());
    }

    @Test
    public void saxophoneCanChooseOtherSoundsToPlay(){
        saxophone.chooseSounds("A#");
        saxophone.makeSound();
        assertEquals("A#", saxophone.makeSound());
    }

    @Test
    public void canGetNumberOfHolesOnSaxophone(){
        assertEquals(88, saxophone.getHoles());
    }

    @Test
    public void canSetNumberOfHoleOnSaxophone(){
        saxophone.setHoles(80);
        assertEquals(80, saxophone.getHoles());
    }

    @Test
    public void canGetBuyingPriceofSaxophone(){
        assertEquals(45, saxophone.getBuyingPrice(), 0.02);
    }

    @Test
    public void canGetSellingPriceOfSaxophone(){
        assertEquals(95, saxophone.getSellingPrice(), 0.02);
    }


}
