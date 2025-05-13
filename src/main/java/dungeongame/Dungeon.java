package dungeongame;
import java.util.ArrayList;
import java.util.List;

/**
 * dungeon where player navigates through
 * moves through doors, does combat, and picks up items
 */
public class Dungeon {
    private Character player;
    private Chamber currentChamber;
    private Chamber goalChamber;

    /**
     * construct dungeon with player
     * @param player player character playing the game
     * @param currentChamber current chamber where player is at
     * @param goalChamber goal chamber to reach
     */
    public Dungeon(Character player, Chamber currentChamber, Chamber goalChamber) {
        this.player = player;
        this.currentChamber = currentChamber;
        this.goalChamber = goalChamber;
    }

    /**
     * current chamber where player is at
     * @return current chamber
     */
    public Chamber getCurrentChamber() {
        return currentChamber;
    }

    /**
     * return the player
     * @return player
     */
    public Character getPlayer () {
        return player;
    }

    /**
     * Move player through doors
     * If monster is guarding the door, player cannot advance
     * @param door the door which player goes through
     */
    public void movePlayer(Door door) {
        if (door.getMonster() != null) {
            System.out.println("Theres a monster guarding the door.");
        } else {
            if (door.getChamber1() == currentChamber) {
                currentChamber = door.getChamber2();
            } else {
                currentChamber = door.getChamber1();
            }
            System.out.println("You moved to the next chamber.\n");
        }
    }

    /**
     * list of actions the player can take in current chamber
     * @return list of actions player can perform
     */
    public List<Action> getActions() {
        List<Action> actions = new ArrayList<>();
        boolean monsterPresent = false;

        for (Door door : currentChamber.getDoors()) {
            Monster monster = door.getMonster();

            if (door.getMonster() != null && monster.getHealth() > 0) {
                monsterPresent = true;
                actions.add(new Fight(door));
            } else {
                actions.add(new Move(door));
            }
        }


        if (!monsterPresent) {
            for (Item item : currentChamber.getItems()) {
                actions.add(new Pick(item));
            }
        }


        return actions;
    }

    public boolean isFinished() {
        return currentChamber == goalChamber;
    }
}
