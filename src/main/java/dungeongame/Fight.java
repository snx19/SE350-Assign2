package dungeongame;

/**
 * represents action where player fights monster
 * player and monster take turns attacking
 */
public class Fight implements Action {
    private Door door;

    /**
     * constructs fight at specific door
     * @param door door where player fights monster
     */
    public Fight(Door door) {
        this.door = door;
    }

    /**
     * executes fight between player and monster
     * takes turn until player or monster reach 0 hp
     * if no monster, there will be no fight
     * @param dungeon Dungeon where action occurs
     */
    @Override
    public void execute(Dungeon dungeon) {
        Character player = dungeon.getPlayer();
        Monster monster = door.getMonster();

        if (monster == null) {
            System.out.println("There is no monster");
            return;
        }
        System.out.println("Fight: " + door.getMonster().getName());

        while (player.getHealth() > 0 && monster.getHealth() >0) {
            monster.takeDamage(player.getStrength());
            System.out.println(monster.getName() + " has " + monster.getHealth() + " health");

            if (monster.getHealth() <= 0) {
                monster.setHealth(0);
                System.out.println(monster.getName() + " has been defeated");
                return;
            }

            player.takeDamage(monster.getStrength());
            System.out.println(player.getName() + " has " + player.getHealth() + " health");

            if (player.getHealth() <= 0) {
                player.setHealth(0);
                System.out.println(player.getName() + " has been defeated");
                return;
            }
        }

    }

    /**
     * returns string describing fight or no monster present
     * @return string describing fight/action or no monster present
     */
    @Override
    public String toString() {
        Monster m = door.getMonster();
        if (m == null) {
            return "No monster to fight";
        }
        return "Fight the " + door.getMonster().getName();
    }
}
