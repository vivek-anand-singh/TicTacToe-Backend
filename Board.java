package TicTacToe;

import java.util.List;

public class Board {
    int size;
    List<List<Cell>> board;
    public Board(int size, List<List<Cell>> board) {
        this.size = size;
        this.board = board;
    }
}
