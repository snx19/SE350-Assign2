package dungeongame;

/**
 * Represents Warrior class
 */
public class Warrior extends PlayerCharacter {

    /**
     * Constructs new Warrior
     * @param name is name of Warrior
     */
    public Warrior(String name) {
        super(name);
        this.health = 20;
        this.strength = 6;
        this.craft = 3;

    }
}