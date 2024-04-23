package TicTacToe;

public class Cell {
    int row, col;
    Player player;
    CellState cellState;
    public Cell(int row, int col, Player player,CellState cellState) {
        this.row = row;
        this.col = col;
        this.player = player;
        this.cellState = cellState;
    }
}
