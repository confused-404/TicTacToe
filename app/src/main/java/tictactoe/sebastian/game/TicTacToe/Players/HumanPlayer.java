package tictactoe.sebastian.game.TicTacToe.Players;

import java.util.Scanner;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import tictactoe.sebastian.game.Interfaces.CellInterface;
import tictactoe.sebastian.game.Interfaces.PlayerInterface;
import tictactoe.sebastian.game.TicTacToe.Board;

@RequiredArgsConstructor
public class HumanPlayer implements PlayerInterface {

    private final Scanner scanner = new Scanner(System.in);
    private final Board board;

    @Getter
    @NonNull
    private final String name;

    @Override
    public CellInterface getNextMove() {




        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNextMove'");
    }
    
}
