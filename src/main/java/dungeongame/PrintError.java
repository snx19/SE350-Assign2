package dungeongame;

/**
 * represents action that handles/prints error msgs
 */

import java.io.IOException;

public class PrintError implements Action {
    private Dungeon dungeon;
    private IOException exception;

    /**
     * constructs print error action
     * @param dungeon dungeon where error occurred
     * @param exception IOException that caused the error
     */
    public PrintError(Dungeon dungeon, IOException exception) {
        this.dungeon = dungeon;
        this.exception = exception;
    }
    /**
     * Execute error by printing error msg
     * @param dungeon Dungeon where action occurs
     */
    @Override
    public void execute(Dungeon dungeon) {
        System.out.println("An error has occurred." + exception.getMessage());
    }

    /**
     * return string describing error
     * @return string describing error
     */
    @Override
    public String toString () {
        return "Error: unable to process input.";
    }
}
