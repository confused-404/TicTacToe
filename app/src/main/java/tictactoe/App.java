package tictactoe;

import tictactoe.game.Game;

public class App {
    
    private Game game;

    public static void main(String[] args) {

        App app = new App();
        app.greet();
        app.game = new Game();
        
    }

    private String generateGreeting() {
        return "Hello, welcome to Tic-Tac-Toe!";
    }

    private void greet() {
        System.out.println(this.generateGreeting());
    }

    public Game getGame() {
        System.out.println("getGame called");
        return this.game;
    }
}
