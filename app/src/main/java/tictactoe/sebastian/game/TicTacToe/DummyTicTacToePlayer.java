package tictactoe.sebastian.game.TicTacToe;

import lombok.AllArgsConstructor;
import tictactoe.sebastian.game.Cell;
import tictactoe.sebastian.game.Player;

@AllArgsConstructor
public class DummyTicTacToePlayer implements Player {

    private final TicTacToeBoard board;

    @Override
    public Cell getNextMove() {
        // use always the first free cell => very stupid ;-)
        return board.getFreeCells().get(0);
    }
    
}
