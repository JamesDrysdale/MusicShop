package instruments;

public abstract class Brass extends Instrument{

    private int valves;

    public Brass(String sound, int valves){
        super(sound);
        this.valves = valves;
    }

    public int valveCount(){
        return this.valves;
    }

}
