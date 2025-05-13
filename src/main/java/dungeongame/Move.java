package dungeongame;

/**
 * represents action where player moves through a door
 */
public class Move implements Action {
    private Door door;

    /**
     * constructs move at speicfic door
     * @param door door at which player moves
     */
    public Move(Door door) {
        this.door = door;
    }

    /**
     * execute move if door is not blocked by monster
     * @param dungeon Dungeon where action occurs
     */
    @Override
    public void execute(Dungeon dungeon) {
        dungeon.movePlayer(door);
    }

    /**
     * return string describing move action
     * tells if door is blocked by monster
     * @return move action or blocked door
     */
    @Override
    public String toString() {
        if (door.getMonster() == null) {
            return "Move through door to next chamber.";
        } else {
            return "Try to move through door (Blocked by " + door.getMonster().getName() + ")";
        }
    }
}
