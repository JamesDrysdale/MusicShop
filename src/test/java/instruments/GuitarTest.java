package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar bassGuitar;

    @Before
    public void before(){
        bassGuitar = new Guitar("Red Special", "Bass", "C#", 4);
    }

    @Test
    public void aGuitarCanHaveAName(){
        assertEquals("Red Special", bassGuitar.getName());
    }

    @Test
    public void canSetGuitarName(){
        bassGuitar.setName("FrankenStrat");
        assertEquals("FrankenStrat", bassGuitar.getName());
    }

    @Test
    public void GuitarHasAType(){
        assertEquals("Bass", bassGuitar.getType());
    }

    @Test
    public void canSetTypeOfGuitar(){
        bassGuitar.setType("Electric");
        assertEquals("Electric", bassGuitar.getType());
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
    public void canGetTheNumberOfStringsOnAGuitar(){
        assertEquals(4, bassGuitar.getStrings());
    }

    @Test
    public void canSetTheNumberofStringsOnAGuitar(){
        bassGuitar.setStrings(5);
        assertEquals(5, bassGuitar.getStrings());
    }

}
