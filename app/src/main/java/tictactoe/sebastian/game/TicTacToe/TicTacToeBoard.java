package tictactoe.sebastian.game.TicTacToe;

import tictactoe.sebastian.game.Board;
import tictactoe.sebastian.game.Cell;
import tictactoe.sebastian.game.CellValue;

import java.util.ArrayList;
import java.util.List;

public class TicTacToeBoard implements Board {

    private final int MAX_FIELDS_IN_ROW = 3;

    private final TicTacToeCell[][] cells = new TicTacToeCell[MAX_FIELDS_IN_ROW][MAX_FIELDS_IN_ROW];

    @Override
    public void init() {
        for (int x = 0; x < MAX_FIELDS_IN_ROW; x++) {
            for (int y = 0; y < MAX_FIELDS_IN_ROW; y++) {
                cells[x][y] = new TicTacToeCell(x, y, CellValue.Empty);
            }
        }
    }

    @Override
    public void setCellValue(int xPosition, int yPosition, CellValue value) {
        if (cells[xPosition][yPosition].getValue() != CellValue.Empty)
            throw new UnsupportedOperationException("cell has already a value");

        cells[xPosition][yPosition].setValue(value);
    }

    @Override
    public boolean existsFreeCell() {
        boolean hasFreeCells = false;

        for (int x = 0; x < MAX_FIELDS_IN_ROW; x++) {
            for (int y = 0; y < MAX_FIELDS_IN_ROW; y++) {
                if (cells[x][y].getValue() == CellValue.Empty) {
                    hasFreeCells = true;
                    break;
                }
            }
        }

        return hasFreeCells;
    }

    @Override
    public List<Cell> getFreeCells() {
        List<Cell> freeCells = new ArrayList<>();

        for (int x = 0; x < MAX_FIELDS_IN_ROW; x++) {
            for (int y = 0; y < MAX_FIELDS_IN_ROW; y++) {
                if (cells[x][y].getValue() == CellValue.Empty) {
                    freeCells.add(cells[x][y]);
                }
            }
        }

        return freeCells;
    }
}
