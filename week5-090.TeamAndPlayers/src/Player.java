/**
 * Created by blakebharris on 1/20/2017.
 */
public class Player {
    private String playerName;
    private int goals;

    public Player(String name) {
        this.playerName = name;
    }

    public Player(String name, int goals) {
        this.playerName = name;
        this.goals = goals;
    }

    public int goals() {
        return this.goals;
    }

    public String getName(){
        return this.playerName;
    }

    public String toString(){
        return "Player: " + this.playerName + ", goals " + this.goals;
    }
}
