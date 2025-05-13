package dungeongame;

/** Represents Wizard class */
public class Wizard extends PlayerCharacter {
    /**
     * Constructs new Wizard
     * @param name is name of wizard
     */
    public Wizard(String name) {
        super(name);
        this.health = 15;
        this.strength = 3;
        this.craft = 6;
    }
}