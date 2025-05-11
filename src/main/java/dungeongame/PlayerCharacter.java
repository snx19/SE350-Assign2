package dungeongame;
/**
 * Represents player character in dungeon game
 * The player has different stats such as health, strength, craft
 * Stats determined by class (Warrior or Wizard)
 * */
public class PlayerCharacter implements Character {

    private int health; /** Health of player  */
    private int strength; /** Strength of player*/
    private int craft; /** Craft of player*/
    private String name; /** Name of player*/
    private CharacterClass classType; /** Class type of player*/

    /**
     * Constructs new PlayerCharacter based on class type
     * Stats determined based on class type
     * @param classType is the class type of the player character
     * */
    public PlayerCharacter(String name, CharacterClass classType) {
        this.name = name;
        this.classType = classType;

        switch (classType) {
            case WARRIOR:
                this.health = 120;
                this.strength = 12;
                this.craft = 30;
                break;

            case WIZARD:
                this.health = 90;
                this.strength = 10;
            this.craft = 50;
            break;
        }
    }

    /**
     * Returns the players name
     *
     * @return name of player
     * */
    public String getName() {
        return name;
    }

    /**
     * Return players health
     *
     * @return current health of player
     * */
    @Override
    public int getHealth() {
        return health;
    }

    /**
     * Return players strength
     *
     *
     * @return current strength of player
     * */
    @Override
    public int getStrength() {
        return strength;
    }

    /**
     * Return players craft
     *
     *
     * @return current craft of player
     * */
    @Override
    public int getCraft() {
        return craft;
    }

    /**
     * Reduces player health by damage taken
     *
     * @param damage taken by player
     * */
    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    /**
     * Return players class type
     *
     *
     * @return class type of player
     * */
    @Override
    public CharacterClass getCharacterClass() {
        return classType;
    }

}
