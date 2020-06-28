package instruments;

public abstract class StringInstrument extends Instrument{

    private int strings;

    public StringInstrument(String name, String sound, int strings){
        super(name, sound);
        this.strings = strings;
    }

    public int getStrings(){
        return this.strings;
    }

    public void setStrings(int strings){
        this.strings = strings;
    }

}
