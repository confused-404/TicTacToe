package tictactoe.sebastian.game;

public interface Board {

    void init();
    
    boolean existsFreeCell();

    void setCellValue(int xPosition, int yPosition, CellValue value);

}
