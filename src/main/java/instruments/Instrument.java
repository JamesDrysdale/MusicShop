package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String name;
    private String sound;

    public Instrument (String name, String sound){
        this.name = name;
        this.sound = sound;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
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
