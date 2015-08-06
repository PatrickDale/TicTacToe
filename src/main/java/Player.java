import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by pdale on 8/6/15.
 */
public class Player {
    private BufferedReader bufferedReader;

    public Player(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String nextMoveLocation() {
        return getUserInput();
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
