package dungeongame;

/**
 * Represents an axe
 * increases strength by 3 when picked up
 */
public class Axe implements Item {

    /**
     * Return name of item
     * @return name of item
     */
    @Override
    public String getName() {
        return "Axe";
    }

    /**
     * Applies strength boost of axe to player
     * Increase strength by 3
     * @param player the player picking up the item
     */
    @Override
    public void applyItem(Character player) {
        player.setStrength(player.getStrength() + 3);
        System.out.println("Your strength has increased by 3.");
    }
}
