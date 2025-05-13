package dungeongame;

/**
 * Represents an action where player picks up an item
 */
public class Pick implements Action {
    private Item item ;

    /**
     * Constructs pick action for items
     * @param item item that gets picked up
     */
    public Pick(Item item) {
        this.item = item;
    }

    /**
     * removes picked up item from dungeon and adds to player
     * @param dungeon Dungeon where action occurs
     */
    @Override
    public void execute(Dungeon dungeon) {
        dungeon.getCurrentChamber().getItems().remove(item);
        item.applyItem(dungeon.getPlayer());
        System.out.println("You picked up a " +item.getName());
    }

    /**
     * Describes action
     * @return string describing pick action
     */
    public String toString() {
        return "Pick up item: " + item.getName();
    }
}
