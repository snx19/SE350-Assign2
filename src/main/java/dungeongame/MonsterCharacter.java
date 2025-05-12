package dungeongame;
/**
 * Represents monster character in dungeon game
 * The monster has different stats such as health, strength, craft
 * */
public abstract class MonsterCharacter implements Character {
    protected int health; /** Health of monster */
    protected int strength; /** Strength of monster */
    protected int craft; /** Craft of monster */

    /**
     * Constructs new MonsterCharacter
     * @param health is the health of monster
     * @param strength is strength of monster
     * @param craft is craft of monster
     */
    public MonsterCharacter(int health, int strength, int craft) {
        this.health = health;
        this.strength = strength;
        this.craft = craft;
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
    }

    /** Represents Spider class */
    public static class Spider extends MonsterCharacter{
        /** Constructs new Spider */
        public Spider() {
            super(0, 0, 0);
        }
    }

    /** Represents Goblin class */
    public static class Goblin extends MonsterCharacter{
        /** Constructs new Goblin */
        public Goblin() {
            super(0, 0, 0);
        }
    }
}
