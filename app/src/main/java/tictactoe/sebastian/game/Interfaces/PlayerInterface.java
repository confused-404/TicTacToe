package tictactoe.sebastian.game.Interfaces;

import tictactoe.sebastian.game.TicTacToe.Board;

public interface PlayerInterface {
    
    String getName();

    CellInterface getNextMove();

    void setBoard(Board board);
}
