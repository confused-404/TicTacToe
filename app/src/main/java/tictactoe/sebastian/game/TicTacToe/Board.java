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

    public Cell getCell(int xPosition, int yPosition) {
        return cells[xPosition][yPosition];
    }

    @Override
    public PlayerInterface getCurrentPlayer() {
        return currentPlayer;
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

    public void swapCurrentPlayer() {
        if (currentPlayer == firstPlayer) {
            currentPlayer = secondPlayer;
        } else {
            currentPlayer = firstPlayer;
        }
    }

    public String whoWins() {

        // check rows

        for (int x = 0; x < MAX_FIELDS_IN_ROW; x++) {
            if (cells[x][0].getValue() == CellValue.X && cells[x][0].getValue() == cells[x][1].getValue() && cells[x][0].getValue() == cells[x][2].getValue()) {
                return "X";
            }
        }

        for (int x = 0; x < MAX_FIELDS_IN_ROW; x++) {
            if (cells[x][0].getValue() == CellValue.O && cells[x][0].getValue() == cells[x][1].getValue() && cells[x][0].getValue() == cells[x][2].getValue()) {
                return "O";
            }
        }

        // check columns

        for (int y = 0; y < MAX_FIELDS_IN_ROW; y++) {
            if (cells[0][y].getValue() == CellValue.X && cells[0][y].getValue() == cells[1][y].getValue() && cells[0][y].getValue() == cells[2][y].getValue()) {
                return "X";
            }
        }
        
        for (int y = 0; y < MAX_FIELDS_IN_ROW; y++) {
            if (cells[0][y].getValue() == CellValue.O && cells[0][y].getValue() == cells[1][y].getValue() && cells[0][y].getValue() == cells[2][y].getValue()) {
                return "O";
            }
        }

        // check diagonals

        if (cells[0][0].getValue() == CellValue.X && cells[0][0].getValue() == cells[1][1].getValue() && cells[0][0].getValue() == cells[2][2].getValue()) {
            return "X";
        }

        if (cells[0][2].getValue() == CellValue.X && cells[0][2].getValue() == cells[1][1].getValue() && cells[0][2].getValue() == cells[2][0].getValue()) {
            return "X";
        }

        if (cells[0][0].getValue() == CellValue.O && cells[0][0].getValue() == cells[1][1].getValue() && cells[0][0].getValue() == cells[2][2].getValue()) {
            return "O";
        }

        if (cells[0][2].getValue() == CellValue.O && cells[0][2].getValue() == cells[1][1].getValue() && cells[0][2].getValue() == cells[2][0].getValue()) {
            return "O";
        }

        return null;
    }
}