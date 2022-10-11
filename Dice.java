package game;
import java.util.Random;

public class Dice {
   public int numOfSides;
//Konstruktor, anropas med nyckelord new
    public Dice(int numOfSides){
        this.numOfSides=numOfSides; }
    // nummer mellan 1-6!
    public int roll() {
        Random diceRandom = new Random();
        int result = diceRandom.nextInt(numOfSides)+1;
        return result;
    }
}