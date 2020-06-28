package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {
    Saxaphone saxaphone;

    @Before
    public void before(){
        saxaphone = new Saxaphone();
    }

    @Test
    public void saxaphoneCanPlaySound(){
        saxaphone.play("A C B C A");
        assertEquals("A C B C A", saxaphone.play("A C B C A"));
    }


}
