package tictactoe.sebastian.game.TicTacToe;

import tictactoe.sebastian.game.Game;
import tictactoe.sebastian.game.Player;

public class TicTacToeGame implements Game {

    private final TicTacToeBoard board;

    @Override
    public void start() {

    }

    @Override
    public void start(Player startPlayer) {
        board = new TicTacToeBoard();

    }

    @Override
    public void print() {
        System.out.println("current player : ");
        board.print();
    }
}
