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
        while (true) {
            System.out.println("Enter the size of the board: ");
            String strSize = Input.getLine();

            try {
                Integer size = Integer.parseInt(strSize);
                // TODO use no magic numbers
                // e.g use minBoardSize = 3
                // maxBoardSize = 10
                if (size < 3 || size > 10) {
                    System.out.println("Invalid input. Please enter a number between 3 and 10.");
                    continue;
                }
                return size;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }
        }
        
    }

    public Integer getSize() {
        return this.size;
    }

    public Cell[][] getCells() {
        return this.cells;
    }

}
