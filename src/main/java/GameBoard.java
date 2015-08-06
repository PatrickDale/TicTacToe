import java.util.ArrayList;
import java.util.List;

/**
 * Created by pdale on 8/6/15.
 */
public class GameBoard {

    private List<List<String>> gameBoard;

    public GameBoard(List<List<String>> gameBoard) {
        this.gameBoard = gameBoard;
//        gameBoard = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            List<String> row = new ArrayList<>();
//            for (int j = 0; j < 3; j++) {
//                row.add(" ");
//            }
//            gameBoard.add(row);
//        }
    }
    public List<List<String>> currentBoard() {
//        String board = "";
//        for (List<String> row : gameBoard) {
//            for (String token : row) {
//                board += token + "|";
//            }
//            board = board.substring(0, board.length() - 1);
//            board += "\n------\n";
//        }
//        board = board.substring(0, board.length() - 8);
        return gameBoard;
    }

    public void addPlayerTokenToGameBoard(String token, String moveLocation) {
        if (moveLocation == null) {
            moveLocation = "1";
        }
        Integer location = Integer.parseInt(moveLocation) - 1;
        Double rowCeiling = Math.ceil(location / 3);
        Integer row = rowCeiling.intValue();
        Integer column = location % 3;
        gameBoard.get(row).set(column, token);
    }
}