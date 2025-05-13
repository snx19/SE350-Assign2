package dungeongame;
/**
 * Represents monster character in dungeon game
 * The monster has different stats such as health, strength, craft
 * */
public class Monster implements Character {
    private String name; /** Name of monster */
    private int health; /** Health of monster */
    private int strength; /** Strength of monster */
    private int craft; /** Craft of monster */

    /**
     * Constructs new MonsterCharacter
     * @param name is the name of monster
     * @param health is the health of monster
     * @param strength is strength of monster
     * @param craft is craft of monster
     */
    public Monster(String name, int health, int strength, int craft) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.craft = craft;
    }

    public String getName() {
        return name;
    }

    /**
     * sets monster health
     * @param health current health of monster
     */
    @Override
    public void setHealth(int health) {
        this.health = health;
    }
    /**
     * Return monsters health
     * @return current health of monster
     */
    @Override
    public int getHealth() {
        return health;
    }

    /**
     * Return monsters strength
     * @return current strength of monster
     */
    @Override
    public int getStrength() {
        return strength;
    }

    /**
     * Return monsters craft
     * @return current craft of monster
     */
    @Override
    public int getCraft() {
        return craft;
    }

    /**
     * Reduces monster health by damage taken
     * @param damage taken by monster
     */
    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

}
