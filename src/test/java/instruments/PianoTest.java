package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano grandPiano;

    @Before
    public void before(){
        grandPiano = new Piano("Bechstein", "Concert Grand", "C D C", 88, 50, 200);
    }

    @Test
    public void pianoCanHaveAName(){
        assertEquals("Bechstein", grandPiano.getName());
    }

    @Test
    public void canSetPianoName(){
        grandPiano.setName("Fazioli");
        assertEquals("Fazioli", grandPiano.getName());
    }

    @Test
    public void canSetTypeOfPiano(){
        grandPiano.setType("Electric Keyboard");
        assertEquals("Electric Keyboard", grandPiano.getType());
    }

    @Test
    public void pianoHasAType(){
        assertEquals("Concert Grand", grandPiano.getType());
    }

    @Test
    public void pianoCanPlaySound(){
        grandPiano.makeSound();
        assertEquals("C D C", grandPiano.makeSound());
    }

    @Test
    public void pianoCanChooseOtherSoundsToPlay(){
        grandPiano.chooseSounds("B");
        grandPiano.makeSound();
        assertEquals("B", grandPiano.makeSound());
    }

    @Test
    public void canGetHowManyKeysAKeyboardHas(){
        assertEquals(88, grandPiano.getKeys());
    }

    @Test
    public void canSetHowManyKeysAKeyboardHas(){
        grandPiano.setKeys(97);
        assertEquals(97, grandPiano.getKeys());
    }

    @Test
    public void canGetBuyingPriceofPiano(){
        assertEquals(50, grandPiano.getBuyingPrice(), 0.02);
    }

    @Test
    public void canGetSellingPriceOfPiano(){
        assertEquals(200, grandPiano.getSellingPrice(), 0.02);
    }

}
