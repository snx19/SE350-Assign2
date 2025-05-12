package dungeongame;


public class Move implements Action {
    private Door door;

    public Move(Door door) {
        this.door = door;
    }

    @Override
    public void execute(Dungeon dungeon) {
        dungeon.movePlayer(door);
    }

    @Override
    public String toString() {
        if (door.getMonster() == null) {
            return "Move through door to next chamber.";
        } else {
            return "Try to move through door (Blocked by " + door.getMonster().getName() + ")";
        }
    }
}
