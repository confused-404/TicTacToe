package tictactoe;

import tictactoe.game.Game;

public class App {
    
    private Game game;

    public static void main(String[] args) {
        
        App app = new App();
        app.game = new Game();
        
    }
}
