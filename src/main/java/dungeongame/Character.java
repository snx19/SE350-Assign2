package dungeongame;

public interface Character {

    String getName();
    int getHealth();
    int getStrength();
    int getCraft();
    void takeDamage(int damage);

    default void setHealth(int health) {
        throw new UnsupportedOperationException("Cant set health on monster");
    }
    default void setStrength(int strength) {
        throw new UnsupportedOperationException("Cant set strength on monster");
    }
}

