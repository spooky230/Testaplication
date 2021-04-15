package company.TRA_tenis;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeasonResults that = (SeasonResults) o;
        return wins == that.wins && goals == that.goals && loses == that.loses;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wins, goals, loses);
    }

    public int getLoses() {
        return loses;
    }

    public int getWins() {
        return wins;
    }
    public int score(){
    int score =goals + (wins*5) - (loses*7);
    return score;
    }
    public int totalGames(){
        return wins+loses;
    }

    @Override
    public int compareTo(SeasonResults SecondResult) {
        return -Integer.compare(score(),SecondResult.score());
    }
}
