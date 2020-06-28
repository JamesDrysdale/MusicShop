package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano grandPiano;

    @Before
    public void before(){
        grandPiano = new Piano("C D C", 88);
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
    public void aGrandPianoHas88keys(){
        assertEquals(88, grandPiano.keyCount());
    }

}
