package shop;

import instruments.Guitar;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class shopTest {

    Guitar guitar;
    Shop shop;
    ArrayList<Instrument> shopStock;

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

    @Test
    public void shopHasAListOfStock(){
        assertEquals(0, shop.getShopStock().size());
    }

    @Test
    public void canAddStockToShop(){
        shop.addStock(guitar);
        assertEquals(1, shop.getShopStock().size());
    }


}
