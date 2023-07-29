package sebastian.game.TicTacToe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tictactoe.sebastian.game.TicTacToe.TicTacToeBoard;

public class TicTacToeBoardTest {

    private TicTacToeBoard board;

    @BeforeEach
    void initBoard(){
        board.init();
    }

    @Test
    @DisplayName("can get empty cells")
    void canGetEmptyCells(){
        assertEquals(9, board.getFreeCells().size());
    }
    

    // TODO add more tests
}
