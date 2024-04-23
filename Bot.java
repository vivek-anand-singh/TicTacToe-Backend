package TicTacToe;

public class Bot extends  Player{
    BotDifficultyLevel botDifficultyLevel;
    public Bot(BotDifficultyLevel botDifficultyLevel,String name,Symbol symbol,PlayerType playerType){
        super(name,symbol,playerType);
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
