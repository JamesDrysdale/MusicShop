package instruments;

public abstract class StringInstrument extends Instrument{

    private int strings;

    public StringInstrument(String sound, int strings){
        super(sound);
        this.strings = strings;
    }

    public int stringCount(){
        return this.strings;
    }

}
