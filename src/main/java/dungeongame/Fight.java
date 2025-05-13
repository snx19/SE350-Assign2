package dungeongame;

public class Fight implements Action {
    private Door door;

    public Fight(Door door) {
        this.door = door;
    }

    @Override
    public void execute(Dungeon dungeon) {
        System.out.println("Fight: " + door.getMonster().getName());
    }

    @Override
    public String toString() {
        return "Fight the " + door.getMonster().getName();
    }
}
