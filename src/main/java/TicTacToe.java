import java.io.PrintStream;

/**
 * Created by pdale on 8/6/15.
 */
public class TicTacToe {


    private PrintStream printStream;

    public TicTacToe(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void run() {
        printStream.print(" | |\n------\n | |\n" +
                "------\n | |");
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe(System.out);
        ticTacToe.run();
    }
}
