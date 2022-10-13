package game;

import java.util.Scanner;
// TESTAR
public class RockPaperScissorsGame {

    Player player;
    Fist aIFist;

    RockPaperScissorsGame(String playerName, int playerScore) {
        player = new Player(playerName, playerScore);
        aIFist = new Fist();
    }

    public static void main(String[] args) {
        RockPaperScissorsGame game = new RockPaperScissorsGame("", 0);
        game.playGame();
        aIFist.play();
    }

    void playGame() {
        Scanner scanner = new Scanner(System.in);

        //forloop börjar här
        for (int i = 0; i < 3; i++) {
            int guess = 0;
            int wrongGuess = 0;
            boolean guessIsOutOfBounds = true;

            System.out.println("Rock, Paper or Scissors?: ");
            String choice = scanner.nextLine();

            String stringResult = "";
            int intResult = aIFist.play();

            if (intResult == Fist.ROCK) {
                stringResult = "ROCK";
            }
            if (intResult == Fist.PAPER) {
                stringResult = "PAPER";
            }
            
            
            
            if (intResult == Fist.SCISSORS) {
                stringResult = "SCISSORS";
            }
            if (choice.equals("Rock") && stringResult.equals("ROCK")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Oavgjort!");
            }
            if (choice.equals("Paper") && stringResult.equals("ROCK")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Du vann!");
            }
            if (choice.equals("Scissors") && stringResult.equals("ROCK")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Datorn vann!");
            }
            if (choice.equals("Rock") && stringResult.equals("PAPER")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Datorn vann!");
            }
            if (choice.equals("Rock") && stringResult.equals("SCISSORS")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Du vann!");
            }
            if (choice.equals("Scissors") && stringResult.equals("SCISSORS")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Oavgjort!");
            }
            if (choice.equals("Scissors") && stringResult.equals("PAPER")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Du vann!");
            }
            if (choice.equals("Paper") && stringResult.equals("PAPER")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Oavgjort!");
            }
            if (choice.equals("Paper") && stringResult.equals("SCISSORS")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Datorn vann!");
            }
        }

    }
}
