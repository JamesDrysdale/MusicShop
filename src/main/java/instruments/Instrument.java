package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    public String play(String sound){
        return sound;
    }

}
