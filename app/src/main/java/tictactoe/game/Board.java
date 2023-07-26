package tictactoe.game;

import tictactoe.Input;

public class Board {
    
    private Integer size;
    private Cell[][] cells;

    public Board() {
        this.initBoard();
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    private void initBoard() {

        this.size = this.getBoardSize();

        this.cells = new Cell[this.size][this.size];
    }

    private Integer getBoardSize() {
        System.out.println("Enter the size of the board: ");
        String strSize = Input.scanner.nextLine();

        try {
            Integer size = Integer.parseInt(strSize);
            return size;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            return this.getBoardSize();
        }
    }

}
