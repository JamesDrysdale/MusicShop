package instruments;

public abstract class Brass extends Instrument{

    private int valves;

    public Brass(String sound, int valves){
        super(sound);
        this.valves = valves;
    }

    public int getValves(){
        return this.valves;
    }

    public void setValves(int valves){
        this.valves = valves;
    }

}
