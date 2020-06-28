package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano grandPiano;

    @Before
    public void before(){
        grandPiano = new Piano("Bechstein", "C D C", 88);
    }

    @Test
    public void pianoCanHaveAName(){
        assertEquals("Bechstein", grandPiano.getName());
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

}
