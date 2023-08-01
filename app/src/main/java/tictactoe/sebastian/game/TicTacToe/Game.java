package tictactoe.sebastian.game.TicTacToe;

import tictactoe.sebastian.game.Interfaces.CellInterface;
import tictactoe.sebastian.game.Interfaces.GameInterface;
import tictactoe.sebastian.game.Interfaces.PlayerInterface;
import tictactoe.sebastian.game.TicTacToe.Players.DummyPlayer;

public class Game implements GameInterface {

    private Board board;
    private GameStatus gameStatus;

    @Override
    public void start(PlayerInterface p1, PlayerInterface p2) {
        board = new Board();
        p1.setPlayerSymbol(CellValue.X);
        p2.setPlayerSymbol(CellValue.O);
        board.init(p1, p2);
        p1.setBoard(board);
        p2.setBoard(board);
    }

    @Override
    public void print() {
        System.out.println("current player : ");
        board.print();
    }

    public void gameLoop() {

        gameStatus = GameStatus.IN_PROGRESS;

        while (gameStatus == GameStatus.IN_PROGRESS) {
            if (!board.existsFreeCell() || board.isGameWon()) {
                gameStatus = GameStatus.OVER;
                break;
            }
            board.print();
            CellInterface move = board.getCurrentPlayer().getNextMove();
            board.setCellValue(move.getXPosition(), move.getYPosition(), board.getCurrentPlayer().getPlayerSymbol());
            board.swapCurrentPlayer();
        }

        //TODO know who won the game
        
    }
}
