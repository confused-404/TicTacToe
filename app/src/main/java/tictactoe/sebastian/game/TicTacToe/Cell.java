package tictactoe.sebastian.game.TicTacToe;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import tictactoe.sebastian.game.Interfaces.CellInterface;

@ToString
@RequiredArgsConstructor
public class Cell implements CellInterface {

    @ToString.Exclude
    @Getter
    private final int xPosition;

    @ToString.Exclude
    @Getter
    private final int yPosition;

    @Getter
    // @Setter // TODO check that not possible overwrite already set value
    @NonNull
    private CellValue value;

    public void setValue(CellValue val) {
        if (value == CellValue.Empty) {
            value = val;
        } 
    }
    
}
