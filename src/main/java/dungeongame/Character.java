package dungeongame;

/**
 * Represents character in dungeon game
 * Characters have health, strength, craft and take damage
 */
public interface Character {

    /**
     * gets name of character
     * @return name of character
     * */
    String getName();

    /**
     * gets health of character
     * @return health of character
     */
    int getHealth();

    /**
     * get strength of character
     * @return strength of character
     */
    int getStrength();

    /**
     * get craft of character
     * @return craft of character
     */
    int getCraft();

    /**
     * Decrease health based on damage
     * @param damage amount of damage character takes
     */
    void takeDamage(int damage);

    /**
     * set character health
     * @param health value of health
     */
    default void setHealth(int health){}

    /**
     * set strength of character
     * @param strength value of strength
     * @throws UnsupportedOperationException prevents this method being used on monsters
     */
    default void setStrength(int strength) {
        throw new UnsupportedOperationException("Cant set strength on monster");
    }
}

