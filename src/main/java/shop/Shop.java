package shop;

import behaviours.ISell;
import instruments.Instrument;

public class Shop implements ISell {


    @Override
    public double calculateMarkup(Instrument instrument) {
        double buyingPrice = instrument.getBuyingPrice();
        double sellingPrice = instrument.getSellingPrice();
        return sellingPrice - buyingPrice;
    }
}
