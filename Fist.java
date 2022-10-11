package game;
import java.util.Random;

public class Fist {

    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    private Random random;

    public int play(){
        Random random = new Random();
        int result = random.nextInt(3);
        return result;
    }
}