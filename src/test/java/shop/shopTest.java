package shop;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class shopTest {

    Guitar guitar;
    Shop shop;

    @Before
    public void before(){
        guitar = new Guitar("Bat Handler", "Electric", "Epic",
                5, 900, 1600);
        shop = new Shop();
    }


    @Test
    public void canCalculateMarkupOnGuitar(){
        assertEquals(700.00, shop.calculateMarkup(guitar), 0.02);
    }

}
