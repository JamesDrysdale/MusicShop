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

    public void chooseSounds(String sound){
        this.sound = sound;
    }


    @Override
    public String play(){
        return sound;
    }
}
