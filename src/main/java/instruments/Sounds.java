package instruments;

public enum Sounds {
    STRING("Strum"),
    WOODWIND("tootle"),
    BRASS("toooot"),
    KEYBOARD("plink");

    public final String sound;

    Sounds(String sound){
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }

}
