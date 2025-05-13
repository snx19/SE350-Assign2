package dungeongame;

/**
 * Represents an item that can be found in chambers
 */
public interface Item {
    /**
     * Gets name of item
     * @return name of item
     */
    String getName();

    /**
     * Applies item to player
     * @param player the player picking up the item
     */
    void applyItem(Character player);
}
