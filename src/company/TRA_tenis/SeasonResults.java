package company.TRA_tenis;

public class SeasonResults implements Comparable<SeasonResults> {
    private int wins;
    private int goals;
    private int loses;
    public SeasonResults(int wins, int loses, int goals){
        this.wins = wins;
        this.loses = loses;
        this.goals = goals;
    }
    public SeasonResults(){

    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getGoals() {
        return goals;
    }

    public int getLoses() {
        return loses;
    }

    public int getWins() {
        return wins;
    }
    public int scoreCounter(){
    int score =goals + (wins*5) - (loses*7);
    return score;
    }

    @Override
    public int compareTo(SeasonResults SecondResult) {
        return Integer.compare(scoreCounter(),SecondResult.scoreCounter());
    }
}
