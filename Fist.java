package game;
import java.util.Random;

public class Fist {

    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    //@TODO: You're not using this global field, you can erase it. You have a local variable that does the job.
    private Random random;

    public int play(){
        Random random = new Random();
        int result = random.nextInt(3);
        return result;
    }
}