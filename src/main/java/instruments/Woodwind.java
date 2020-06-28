package instruments;

public abstract class Woodwind extends Instrument{

    private int holes;

    public Woodwind(String sound, int holes) {
        super(sound);
        this.holes = holes;
    }

    public int getHoles(){
        return this.holes;
    }

    public void setHoles(int holes){
        this.holes = holes;
    }
}
