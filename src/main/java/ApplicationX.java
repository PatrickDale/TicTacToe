import java.io.PrintStream;

/**
 * Created by pdale on 8/6/15.
 */
public class ApplicationX {


    private PrintStream printStream;

    public ApplicationX(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void run() {
        printStream.print("  |  |\n---------\n  |  |\n" +
                "---------\n  |  |");
    }

    public static void main(String[] args) {
        ApplicationX applicationX = new ApplicationX(System.out);
        applicationX.run();
    }
}
