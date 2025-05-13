package dungeongame;
import java.util.List;
import java.util.ArrayList;
/**
 * Represents a chamber
 * Has multiple doors that lead to other chambers
 * Has items players can collect
 */
public class Chamber {
    private List<Door> doors;
    private List<Item> items;

    /**
     * Constructs a new chamber
     * has no doors or items yet
     */
    public Chamber() {
        this.doors = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    /**
     * Constructs a chamber with an item
     * @param item the item added to chamber
     */
    public Chamber(Item item) {
        this(); // calls the default constructor to initialize door and items list
        this.items.add(item);
    }

    /**
     * Returns list of doors connected to this chamber
     * @return list of doors
     */
    public List<Door> getDoors() {
        return doors;
    }

    /**
     * Adds door to chamber
     * @param door adds a door
     */
    public void addDoor(Door door) {
        doors.add(door);
    }

    /**
     * returns items in chamber
     * @return list of items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * adds item to chamber
     * @param item adds an item
     */
    public void addItem(Item item) {
        items.add(item);
    }
}