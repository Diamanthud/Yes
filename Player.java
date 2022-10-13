package game;

public class Player {

    int score = 0;
    private String name;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void rageQuit() {
        System.exit(0);
    }

    public String toString() {
        return "this name" + this.name + ", Score" + this.score;
    }
}
