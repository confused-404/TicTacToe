package tictactoe;

import tictactoe.sebastian.game.TicTacToe.CellValue;
import tictactoe.sebastian.game.TicTacToe.Game;
import tictactoe.sebastian.game.TicTacToe.Players.HumanPlayer;

public class App {
    
    public static void main(String[] args) {
        Game game = new Game();
        HumanPlayer p1 = new HumanPlayer(null, null);
        HumanPlayer p2 = new HumanPlayer(null, null);
        game.start(p1, p2);
        game.print();
    }
}
