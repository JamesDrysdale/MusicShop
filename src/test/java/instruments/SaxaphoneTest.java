package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {
    Saxaphone saxaphone;

    @Before
    public void before(){
        saxaphone = new Saxaphone("A C B C A");
    }

    @Test
    public void saxaphoneCanPlaySound(){
        saxaphone.play();
        assertEquals("A C B C A", saxaphone.play());
    }

    @Test
    public void saxaphoneCanChooseOtherSoundsToPlay(){
        saxaphone.chooseSounds("A#");
        saxaphone.makeSound();
        assertEquals("A#", saxaphone.makeSound());
    }


}
