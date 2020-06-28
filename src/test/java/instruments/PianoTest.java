package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano grandPiano;

    @Before
    public void before(){
        grandPiano = new Piano("C D C");
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

}
