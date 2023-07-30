package sebastian.game.TicTacToe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tictactoe.sebastian.game.TicTacToe.Board;
import tictactoe.sebastian.game.TicTacToe.Players.DummyPlayer;

public class TicTacToeBoardTest {

    private Board board;
    private DummyPlayer p1;
    private DummyPlayer p2;

    @BeforeEach
    void initBoard(){
        board = new Board();
        board.init(p1, p2);
    }

    @Test
    @DisplayName("can get empty cells")
    void canGetEmptyCells(){
        assertEquals(9, board.getFreeCells().size());
    }
    

    // TODO add more tests
}
