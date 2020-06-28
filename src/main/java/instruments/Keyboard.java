package instruments;

public abstract class Keyboard extends Instrument{

    private int keys;

    public Keyboard(String name, String type, String sound, int keys, double buyingValue, double sellingValue){
        super(name, type, sound, buyingValue, sellingValue);
        this.keys = keys;
    }

    public int getKeys(){
        return this.keys;
    }

    public void setKeys(int keys){
        this.keys = keys;
    }
}
