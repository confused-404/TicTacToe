package tictactoe.sebastian.game.Interfaces;

import tictactoe.sebastian.game.TicTacToe.Board;
import tictactoe.sebastian.game.TicTacToe.CellValue;

public interface PlayerInterface {
    
    String getName();

    CellValue getPlayerSymbol();

    CellInterface getNextMove();

    void setBoard(Board board);

    void setPlayerSymbol(CellValue x);
}
