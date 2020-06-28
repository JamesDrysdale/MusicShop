package shop;

import behaviours.ISell;
import instruments.Instrument;

public class Shop implements ISell {


    @Override
    public double calculateMarkup(Instrument instrument) {
        int buyingPrice = instrument.getBuyingValue();
        int sellingPrice = instrument.getSellingPrice();
        return sellingPrice - buyingPrice;
    }
}
