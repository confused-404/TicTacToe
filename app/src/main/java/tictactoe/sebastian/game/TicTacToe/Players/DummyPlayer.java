package tictactoe.sebastian.game.TicTacToe.Players;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import tictactoe.sebastian.game.Interfaces.CellInterface;
import tictactoe.sebastian.game.Interfaces.PlayerInterface;
import tictactoe.sebastian.game.TicTacToe.Board;

@AllArgsConstructor
public class DummyPlayer implements PlayerInterface {

    private final Board board;

    @Getter
    @NonNull
    private final String name;

    @Override
    public CellInterface getNextMove() {
        // use always the first free cell => very stupid ;-)
        return board.getFreeCells().get(0);
    }
    
}
