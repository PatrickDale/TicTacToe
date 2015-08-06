import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by pdale on 8/6/15.
 */
public class Player {
    private BufferedReader bufferedReader;

    public Player(BufferedReader bufferedReader) {

        this.bufferedReader = bufferedReader;
    }

    public String nextMoveLocation() {
        String nextMove = null;
        try {
            nextMove = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nextMove;
    }
}
