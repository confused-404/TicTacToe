package tictactoe.sebastian.game;

import java.util.List;

public interface Board {

    void init();
    
    boolean existsFreeCell();

    List<Cell> getFreeCells();

    void setCellValue(int xPosition, int yPosition, CellValue value);

}
