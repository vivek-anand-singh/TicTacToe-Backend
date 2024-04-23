package TicTacToe;

import TicTacToe.Board;
import TicTacToe.GameState;
import TicTacToe.Move;
import TicTacToe.Player;

import java.util.List;

public class Game{
    Board board;
    List<Player> players;
    Player winner;
    List<Move> moves;
    GameState gameState;
    int nextPlayerIndex;
    public Game(Board board, List<Player> players, Player winner, List<Move> moves, GameState gameState, int nextPlayerIndex){
        this.board = board;
        this.players = players;
        this.winner = winner;
        this.moves = moves;
        this.gameState = gameState;
        this.nextPlayerIndex = nextPlayerIndex;
    }
}