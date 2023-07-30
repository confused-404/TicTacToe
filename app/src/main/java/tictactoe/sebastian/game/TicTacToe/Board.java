package tictactoe.sebastian.game.TicTacToe;

import tictactoe.sebastian.game.Interfaces.BoardInterface;
import tictactoe.sebastian.game.Interfaces.CellInterface;
import tictactoe.sebastian.game.Interfaces.PlayerInterface;

import java.util.ArrayList;
import java.util.List;

public class Board implements BoardInterface {

    private final int MAX_FIELDS_IN_ROW = 3;
    private PlayerInterface firstPlayer;
    private PlayerInterface secondPlayer;

    private PlayerInterface currentPlayer;

    private final Cell[][] cells = new Cell[MAX_FIELDS_IN_ROW][MAX_FIELDS_IN_ROW];

    @Override
    public void init(PlayerInterface firstPlayer, PlayerInterface secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.currentPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;

        for (int x = 0; x < MAX_FIELDS_IN_ROW; x++) {
            for (int y = 0; y < MAX_FIELDS_IN_ROW; y++) {
                cells[x][y] = new Cell(x, y, CellValue.Empty);
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
    public PlayerInterface getCurrentPLayer() {
        return null;
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
    public List<CellInterface> getFreeCells() {
        List<CellInterface> freeCells = new ArrayList<>();

        for (int x = 0; x < MAX_FIELDS_IN_ROW; x++) {
            for (int y = 0; y < MAX_FIELDS_IN_ROW; y++) {
                if (cells[x][y].getValue() == CellValue.Empty) {
                    freeCells.add(cells[x][y]);
                }
            }
        }

        return freeCells;
    }

    @Override
    public void print() {
        for (int x = 0; x < MAX_FIELDS_IN_ROW; x++) {
            for (int y = 0; y < MAX_FIELDS_IN_ROW; y++) {
                System.out.print(cells[x][y].getValue() + " ");
            }
            System.out.println();
        }
    }
}
