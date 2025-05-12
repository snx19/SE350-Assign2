package dungeongame;

/**
 * Represents an action the player takes
 */
public interface Action {

    /**
     * Executes action on dungeon
     * @param dungeon Dungeon where action occurs
     */
    void execute(Dungeon dungeon);

    /**
     * Returns a string that describes the action
     * @return Description of action
     */
    @Override
    String toString();
}
