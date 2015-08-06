import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by pdale on 8/6/15.
 */
public class TicTacToe {


    private PrintStream printStream;
    private Player player;
    private GameBoard gameBoard;

    public TicTacToe(PrintStream printStream, Player player) {
        this.printStream = printStream;
        this.player = player;
        gameBoard = new GameBoard(buildBoard());
    }

    private List<List<String>> buildBoard() {
        List<List<String>> board = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(" ");
            }
            board.add(row);
        }
        return board;
    }

    public void run() {
        displayGameBoard();
        promptPlayerToEnterAMoveLocation();
        String moveLocation = player.nextMoveLocation();
        gameBoard.addPlayerTokenToGameBoard("X", moveLocation);
        displayGameBoard();
    }

    private void displayGameBoard() {
        List<List<String>> board = gameBoard.currentBoard();
        String toDisplay = "";
        for (List<String> row : board) {
            for (String token : row) {
                toDisplay += token + "|";
            }
            toDisplay = toDisplay.substring(0, toDisplay.length() - 1);
            toDisplay += "\n------\n";
        }
        toDisplay = toDisplay.substring(0, toDisplay.length() - 8);
        printStream.println(toDisplay);
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
