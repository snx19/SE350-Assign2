package dungeongame;

public class Fight implements Action {
    private Door door;

    public Fight(Door door) {
        this.door = door;
    }

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
                System.out.println(monster.getName() + " has been defeated");
                return;
            }

            player.takeDamage(monster.getStrength());
            System.out.println(player.getName() + " has " + player.getHealth() + " health");

            if (player.getHealth() <= 0) {
                System.out.println(player.getName() + " has been defeated");
                return;
            }
        }

    }

    @Override
    public String toString() {
        return "Fight the " + door.getMonster().getName();
    }
}
