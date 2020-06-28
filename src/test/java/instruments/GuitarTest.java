package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar bassGuitar;

    @Before
    public void before(){
        bassGuitar = new Guitar();
    }

    @Test
    public void instrumentCanPlaySound(){
        bassGuitar.play("C#");
        assertEquals("C#", bassGuitar.play("C#"));
    }



}
