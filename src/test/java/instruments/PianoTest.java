package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano grandPiano;

    @Before
    public void before(){
        grandPiano = new Piano();
    }

    @Test
    public void pianoCanPlaySound(){
        grandPiano.play("C D C");
        assertEquals("C D C", grandPiano.play("C D C"));
    }

}
