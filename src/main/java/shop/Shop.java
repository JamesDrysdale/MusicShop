package shop;

import behaviours.ISell;
import instruments.Instrument;

import java.util.ArrayList;

public class Shop implements ISell {

    private ArrayList<Instrument> shopStock;

    public Shop(){
        this.shopStock = new ArrayList<Instrument>();
    }

    public ArrayList<Instrument> getShopStock(){
        return shopStock;
    }

    public void addStock(Instrument instrument){
        this.shopStock.add(instrument);
    }


    @Override
    public double calculateMarkup(Instrument instrument) {
        double buyingPrice = instrument.getBuyingPrice();
        double sellingPrice = instrument.getSellingPrice();
        return sellingPrice - buyingPrice;
    }
}
