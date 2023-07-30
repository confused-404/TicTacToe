package tictactoe.sebastian.game.TicTacToe;

import tictactoe.sebastian.game.Interfaces.GameInterface;
import tictactoe.sebastian.game.Interfaces.PlayerInterface;

public class Game implements GameInterface {

    private Board board;

    @Override
    public void start(PlayerInterface p1, PlayerInterface p2) {
        board = new Board();
        board.init(p1, p2);
    }

    @Override
    public void print() {
        System.out.println("current player : ");
        board.print();
    }
}
