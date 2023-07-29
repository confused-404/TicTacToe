package tictactoe.sebastian.game.TicTacToe;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import tictactoe.sebastian.game.Cell;
import tictactoe.sebastian.game.CellValue;


@RequiredArgsConstructor
public class TicTacToeCell implements Cell {

    @Getter
    private final int xPosition;

    @Getter
    private final int yPosition;

    @Getter
    @Setter // TODO check that not possible overwrite already set value
    @NonNull
    private CellValue value;
    
}
