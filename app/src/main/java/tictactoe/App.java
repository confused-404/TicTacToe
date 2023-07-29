package tictactoe;

import tictactoe.game.Game;

public class App {
    
    private Game game;

    public static void main(String[] args) {
        App app = new App();
        
    }

    public App() {
        this.greet();
        this.game = new Game();
    }

    String generateGreeting() {
        return "Hello, welcome to Tic-Tac-Toe!";
    }

    private void greet() {
        String greeting = generateGreeting();
        System.out.println(greeting);
    }

    public Game getGame() {
        System.out.println("getGame called");
        return this.game;
    }
}
