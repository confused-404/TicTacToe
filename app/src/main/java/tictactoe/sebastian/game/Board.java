package tictactoe.sebastian.game;

import java.util.List;

public interface Board {

    void init(Player firstPlayer, Player secondPlayer);
    
    boolean existsFreeCell();

    List<Cell> getFreeCells();

    void setCellValue(int xPosition, int yPosition, CellValue value);

    Player getCurrentPLayer();

}
