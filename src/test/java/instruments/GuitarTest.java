package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar bassGuitar;

    @Before
    public void before(){
        bassGuitar = new Guitar("C#");
    }

    @Test
    public void guitarCanPlaySound(){
        bassGuitar.makeSound();
        assertEquals("C#", bassGuitar.makeSound());
    }

    @Test
    public void guitarCanChooseOtherSoundsToPlay(){
        bassGuitar.chooseSounds("B A D");
        bassGuitar.makeSound();
        assertEquals("B A D", bassGuitar.makeSound());
    }

    @Test
    public  void bassGuitarHas4Strings(){
        assertEquals(4, bassGuitar.stringCount());
    }



}
