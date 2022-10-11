package game;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice(6);
        
        // 1 Anropa roll (), spara i en variabel
        int result = dice.roll();

        // For-loop
        for (int i = 0; i < 3; i++) {
        
        //Spelare gissar och det går in i guess,
        boolean guessOutOfBounds = true;
        int guess = 0;
        while (guessOutOfBounds) {
            System.out.println("Guess what the dice rolled");
            guess = scanner.nextInt();
        if (guess >= 1 && guess <= 6) {
                guessOutOfBounds = false;
            }
        }
            // skriv ut resultat
            System.out.println("You guessed " + guess + ".");

            // Skriv ut om spelaren gissade rätt
            if (result == guess) {
                System.out.println("The dice rolled: " + result + '\n' + "You win! ");
                break;
               }else {
                System.out.println("Wrong guess! You have " + (2 - i) + " guesses left");
               }
               scanner.close();
        }

}
}
