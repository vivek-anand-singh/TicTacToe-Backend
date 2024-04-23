package TicTacToe;

import java.lang.foreign.SymbolLookup;

public class Player {
    String name;
    Symbol symbol;
    PlayerType playerType;

    public Player(String name, Symbol symbol, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }
}
