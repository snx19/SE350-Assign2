package dungeongame;

import java.io.IOException;

public class PrintError implements Action {
    private Dungeon dungeon;
    private IOException exception;

    public PrintError(Dungeon dungeon, IOException exception) {
        this.dungeon = dungeon;
        this.exception = exception;
    }

    @Override
    public void execute(Dungeon dungeon) {
        System.out.println("An error has occurred." + exception.getMessage());
    }

    @Override
    public String toString () {
        return "Error: unable to process input.";
    }
}
