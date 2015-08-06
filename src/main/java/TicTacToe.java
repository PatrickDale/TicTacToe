import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by pdale on 8/6/15.
 */
public class TicTacToe {


    private PrintStream printStream;
    private Player player;
    private Collection<Collection<String>> gameBoard;

    public TicTacToe(PrintStream printStream, Player player) {
        this.printStream = printStream;
        this.player = player;
        initializeGameBoard();
    }

    private void initializeGameBoard() {
        gameBoard = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Collection<String> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(" ");
            }
            gameBoard.add(row);
        }
    }

    public void run() {
        displayGameBoard();
        promptPlayerToEnterAMoveLocation();
        String moveLocation = player.nextMoveLocation();
    }

    private void displayGameBoard() {
        String board = "";
        for (Collection<String> row : gameBoard) {
            for (String token : row) {
                board += token + "|";
            }
            board = board.substring(0, board.length() - 1);
            board += "\n------\n";
        }
        board = board.substring(0, board.length() - 8);
        printStream.println(board);
    }

    private void promptPlayerToEnterAMoveLocation() {
        printStream.print("Enter a number between 1 and 9: ");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        TicTacToe ticTacToe = new TicTacToe(System.out, new Player(bufferedReader));
        ticTacToe.run();
    }
}
