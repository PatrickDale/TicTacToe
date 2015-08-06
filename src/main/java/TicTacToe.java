import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by pdale on 8/6/15.
 */
public class TicTacToe {


    private PrintStream printStream;
    private Player player;

    public TicTacToe(PrintStream printStream, Player player) {
        this.printStream = printStream;
        this.player = player;
    }

    public void run() {
        printStream.print(" | |\n------\n | |\n" +
                "------\n | |\n");
        promptPlayerToEnterAMoveLocation();
        player.nextMoveLocation();
    }

    private void promptPlayerToEnterAMoveLocation() {
        printStream.print("Enter a number between 1 and 9: ");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        TicTacToe ticTacToe = new TicTacToe(System.out, new Player(System.out, bufferedReader));
        ticTacToe.run();
    }
}
