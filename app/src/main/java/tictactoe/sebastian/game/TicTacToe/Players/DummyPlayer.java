package tictactoe.sebastian.game.TicTacToe.Players;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import tictactoe.sebastian.game.Interfaces.CellInterface;
import tictactoe.sebastian.game.Interfaces.PlayerInterface;
import tictactoe.sebastian.game.TicTacToe.Board;
import tictactoe.sebastian.game.TicTacToe.CellValue;

@AllArgsConstructor
public class DummyPlayer implements PlayerInterface {

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
        // use always the first free cell => very stupid ;-)
        return board.getFreeCells().get(0);
    }
    
}
