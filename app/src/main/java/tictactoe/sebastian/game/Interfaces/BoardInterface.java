package tictactoe.sebastian.game.Interfaces;

import java.util.List;

import tictactoe.sebastian.game.TicTacToe.CellValue;

public interface BoardInterface {

    void init(PlayerInterface firstPlayer, PlayerInterface secondPlayer);
    
    boolean existsFreeCell();

    List<CellInterface> getFreeCells();

    void setCellValue(int xPosition, int yPosition, CellValue value);

    PlayerInterface getCurrentPlayer();

    void print();

}
