import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by pdale on 8/6/15.
 */
public class GameBoardTest {

    private GameBoard gameBoard;
    private List<List<String>> board;

    @Before
    public void setUp() throws Exception {
        board = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(" ");
            }
            board.add(row);
        }
        gameBoard = new GameBoard(board);
    }

    @Test
    public void shouldFormatBoardCorrectly() throws Exception {
        List<List<String>> board = gameBoard.currentBoard();

//        assertThat(board, is(" | | \n------\n | | \n------\n | | "));
        assertThat(board, is(this.board));
    }

    @Test
    public void shouldAddTokenToPosition1() throws Exception {
        gameBoard.addPlayerTokenToGameBoard("X", "1");
        List<List<String>> board = gameBoard.currentBoard();

        assertThat(board.get(0).get(0), is("X"));
    }

    @Test
    public void shouldAddTokenToPosition9() throws Exception {
        gameBoard.addPlayerTokenToGameBoard("X", "9");
        List<List<String>> board = gameBoard.currentBoard();

        assertThat(board.get(2).get(2), is("X"));
    }
}
