package dungeongame;

/**
 * Represents a shield
 * increases health by 5 when picked up
 */
public class Shield implements Item {

    /**
     * Return name of item
     * @return name of item
     */
    @Override
    public String getName() {
        return "Shield";
    }

    /**
     * Applies health boost of shield to player
     * Increase health by 5
     * @param player the player picking up the item
     */
    @Override
    public void applyItem(Character player) {
        player.setHealth(player.getHealth() + 5);
        System.out.println("Your health has increased by 5.");
    }
}
