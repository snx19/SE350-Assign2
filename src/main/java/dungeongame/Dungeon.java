package dungeongame;
import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    private Character player;
    private Chamber currentChamber;
    private Chamber goalChamber;

    public Dungeon(Character player, Chamber currentChamber, Chamber goalChamber) {
        this.player = player;
        this.currentChamber = currentChamber;
        this.goalChamber = goalChamber;
    }

    public Chamber getCurrentChamber() {
        return currentChamber;
    }

    public void movePlayer(Door door) {
        if (door.getMonster() == null) {
            if (door.getChamber1() == currentChamber ) {
                currentChamber = door.getChamber2();
            } else {
                currentChamber = door.getChamber1();
            }
            System.out.println("You moved to the next chamber.\n");
        } else {
            System.out.println("Theres a monster guarding the door.\n");
        }
    }

    public List<Action> getActions() {
        // place holder
        return new ArrayList<>();
    }


    public boolean isFinished() {
        return currentChamber == goalChamber;
    }
}
