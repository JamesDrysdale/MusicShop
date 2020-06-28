package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String name;
    private String type;
    private String sound;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument (String name, String type, String sound, double buyingValue, double sellingValue){
        this.name = name;
        this.type = type;
        this.sound = sound;
        this.buyingPrice = buyingValue;
        this.sellingPrice = sellingValue;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String makeSound(){
        return sound;
    }

    public void chooseSounds(String sound){
        this.sound = sound;
    }

    @Override
    public String play(){
        return sound;
    }

    public double getBuyingPrice(){
        return this.buyingPrice;
    }

    public double getSellingPrice(){
        return this.sellingPrice;
    }
}
