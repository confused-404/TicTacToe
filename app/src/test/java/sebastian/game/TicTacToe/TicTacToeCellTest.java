package sebastian.game.TicTacToe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tictactoe.sebastian.game.CellValue;
import tictactoe.sebastian.game.TicTacToe.TicTacToeCell;

public class TicTacToeCellTest {  

    @Test
    @DisplayName("can set cell value")
    void canSetCellValue(){
        TicTacToeCell cell = new TicTacToeCell(0, 0, CellValue.Empty);

        cell.setValue(CellValue.O);
        assertEquals(CellValue.O,cell.getValue());
    }

    @Test
    @DisplayName("can not change cell value if cell value is not empty")
    void canNotChangeCellValueIfCellValueIsNotEmpty(){
        TicTacToeCell cell = new TicTacToeCell(0, 0, CellValue.X);

        cell.setValue(CellValue.O);
        assertEquals(CellValue.X,cell.getValue());
    }
}
