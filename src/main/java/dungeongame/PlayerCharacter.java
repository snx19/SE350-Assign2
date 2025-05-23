package dungeongame;
/**
 * Represents player character in dungeon game
 * The player has different stats such as health, strength, craft
 * */
public abstract class PlayerCharacter implements Character {
    protected int health; /** Health of player */
    protected int strength; /** Strength of player */
    protected int craft; /** Craft of player */
    protected String name; /** Name of player*/

    /**
     * Constructs new PlayerCharacter
     * @param name is the name of player
     */
    public PlayerCharacter(String name) {
        this.name = name;
    }

    /**
     * Returns the players name
     * @return name of player
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * sets health for player
     * @param health of player
     */
    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Return players health
     * @return current health of player
     */
    @Override
    public int getHealth() {
        return health;
    }

    /**
     * sets strength for player
     * @param strength of player
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Return players strength
     * @return current strength of player
     */
    @Override
    public int getStrength() {
        return strength;
    }

    /**
     * Return players craft
     * @return current craft of player
     */
    @Override
    public int getCraft() {
        return craft;
    }

    /**
     * Reduces player health by damage taken
     * @param damage taken by player
     */
    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

}
