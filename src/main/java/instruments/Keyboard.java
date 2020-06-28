package instruments;

public abstract class Keyboard extends Instrument{

    private int keys;

    public Keyboard(String sound, int keys){
        super(sound);
        this.keys = keys;
    }

    public int keyCount(){
        return this.keys;
    }
}
