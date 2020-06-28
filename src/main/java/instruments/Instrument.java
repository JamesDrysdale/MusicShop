package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String sound;

    public Instrument (String sound){
        this.sound = sound;
    }

    public String makeSound(){
        return sound;
    }


    @Override
    public String play(){
        return sound;
    }
}
