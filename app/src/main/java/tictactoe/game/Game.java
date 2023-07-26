package tictactoe.game;

public class Game {
    
    private Board board;

    public Game() {
        this.initGame();
    }

    private void initGame() {
        this.board = new Board();
    }

}
