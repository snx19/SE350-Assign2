package dungeongame;

/**
 * Represents a Door connecting two chambers
 * Can have monsters guarding it
 */
public class Door {
    private Chamber chamber1;
    private Chamber chamber2;
    private Monster monster; // null if chamber is unguarded

    /**
     * Constructs a Door connecting two chambers
     * @param c1 first chamber
     * @param c2 second chamber
     * monster is null if no monsters are guarding the door
     */
    public Door(Chamber c1, Chamber c2) {
        this.chamber1 = c1;
        this.chamber2 = c2;
        this.monster = null;
    }

    /**
     * Constructs a door connecting two chambers with a monster guarding
     * @param c1 first chamber
     * @param c2 second chamber
     * @param monster monster guarding the door
     */
    public Door(Chamber c1, Chamber c2, Monster monster) {
        this.chamber1 = c1;
        this.chamber2 = c2;
        this.monster = monster;
    }

    /**
     * Connects two chambers with a door
     * @param c1 first chamber
     * @param c2 second chamber
     */
    public static void connect (Chamber c1, Chamber c2) {
        Door door = new Door(c1, c2);
        c1.addDoor(door);
        c2.addDoor(door);
    }

    /**
     * connects two chambers with a door and a monster guarding it
     * @param c1 first chamber
     * @param c2 second chamber
     * @param monster monster guarding the door
     */
    public static void connect (Chamber c1, Chamber c2, Monster monster) {
        Door door = new Door(c1, c2, monster);
        c1.addDoor(door);
        c2.addDoor(door);
    }

    /**
     * Gets monster guarding the door
     * @return monster guarding the door or null if none
     */
    public Monster getMonster() {
        return monster;
    }

    /**
     * gets chamber one
     * @return chamber one
     */
    public Chamber getChamber1() {
        return chamber1;
    }

    /**
     * gets chamber 2
     * @return chamber 2
     */
    public Chamber getChamber2() {
        return chamber2;
    }
}
