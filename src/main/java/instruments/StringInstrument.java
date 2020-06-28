package instruments;

public abstract class StringInstrument extends Instrument{

    private int strings;

    public StringInstrument(String name, String type, String sound, int strings, double buyingValue, double sellingValue){
        super(name, type, sound, buyingValue, sellingValue);
        this.strings = strings;
    }

    public int getStrings(){
        return this.strings;
    }

    public void setStrings(int strings){
        this.strings = strings;
    }

}
