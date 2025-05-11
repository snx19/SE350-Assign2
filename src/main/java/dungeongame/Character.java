package dungeongame;

public interface Character {
    int getHealth();
    void takeDamage(int damage);
    int getStrength();
    int getCraft();

    CharacterClass getCharacterClass();
}
