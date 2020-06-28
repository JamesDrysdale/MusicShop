package instruments;

public abstract class Keyboard extends Instrument{

    private int keys;

    public Keyboard(String name, String sound, int keys){
        super(name, sound);
        this.keys = keys;
    }

    public int getKeys(){
        return this.keys;
    }

    public void setKeys(int keys){
        this.keys = keys;
    }
}
