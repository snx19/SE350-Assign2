package dungeongame;

public class PlayerCharacter implements Character {
    private int health;
    private int strength;
    private int craft;
    private String name;

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    public int getCraft() {
        return craft;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }



}
