package dungeongame;

public class PlayerCharacter implements Character {
    private int health;
    private String name;

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

}
