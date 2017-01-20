import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team (String teamName){
        this.name = teamName;
        players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName(){
        return this.name;
    }

    public void addPlayer(Player person){
        if (this.size() < maxSize){
            this.players.add(person);
        }

    }

    public void printPlayers(){
        for(Player p : players) {
            System.out.println(p);

        }
    }

    public void setMaxSize(int num){
        this.maxSize = num;
    }

    public int size(){
        return players.size();
    }

    public int goals(){
        int totalGoals = 0;
        for(Player player : players){
            totalGoals+=player.goals();
        }
        return totalGoals;
    }


}
