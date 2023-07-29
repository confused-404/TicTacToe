package tictactoe.sebastian.game.TicTacToe;

import java.util.Scanner;

import lombok.RequiredArgsConstructor;
import tictactoe.sebastian.game.Cell;
import tictactoe.sebastian.game.Player;

@RequiredArgsConstructor
public class HumayTicTacToePlayer implements Player {

    private final Scanner scanner = new Scanner(System.in);
    private final TicTacToeBoard board;

    @Override
    public Cell getNextMove() {




        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNextMove'");
    }
    
}
