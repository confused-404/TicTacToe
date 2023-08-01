package tictactoe.sebastian.game.TicTacToe.Players;

import java.util.List;
import java.util.Scanner;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import tictactoe.Input;
import tictactoe.sebastian.game.Interfaces.CellInterface;
import tictactoe.sebastian.game.Interfaces.PlayerInterface;
import tictactoe.sebastian.game.TicTacToe.Board;
import tictactoe.sebastian.game.TicTacToe.Cell;
import tictactoe.sebastian.game.TicTacToe.CellValue;

@RequiredArgsConstructor
public class HumanPlayer implements PlayerInterface {

    @Getter
    @Setter
    private Board board;

    @Getter
    @Setter
    private CellValue playerSymbol;

    @Getter
    @NonNull
    private final String name;

    @Override
    public CellInterface getNextMove() {

        List<CellInterface> validMoves = board.getFreeCells();

        while (true) {

            System.out.println("Enter move in the format 'x,y' : ");
            String input = Input.scanner.nextLine();

            String[] split = input.split(",");

            try {
                int x = Integer.parseInt(split[0]);
                int y = Integer.parseInt(split[1]);

                Cell cell = board.getCell(y, x); // sneaky swap ;)

                if (validMoves.contains(cell)) {
                    return cell;
                }

                System.out.println("Invalid move, please try again");
                continue;
                
            } catch (Exception e) {
                System.out.println("Invalid move, please try again");
                continue;
            }
        }
    }
}
