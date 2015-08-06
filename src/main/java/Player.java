import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by pdale on 8/6/15.
 */
public class Player {
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    public Player(PrintStream printStream, BufferedReader bufferedReader) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public String nextMoveLocation() {
        promptUserToGetNextMove();
        return getUserInput();
    }

    private void promptUserToGetNextMove() {
        printStream.print("Enter a number between 1 and 9: ");
    }

    private String getUserInput() {
        String input = null;
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
