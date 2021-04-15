package company.TRA_tenis;

import java.util.Objects;

public class Profile implements Comparable <Profile>{
    private TenisPlayer player;
    private SeasonResults result;
    public Profile(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return Objects.equals(player, profile.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player);
    }

    public Profile(TenisPlayer player, SeasonResults result){
        this.player = player;
        this.result = result;
    }
    public TenisPlayer getPlayer() {
        return player;
    }

    public void setResult(SeasonResults result) {
        this.result = result;
    }

    public SeasonResults getResult() {
        return result;
    }

    public void setPlayer(TenisPlayer player) {
        this.player = player;
    }

    @Override
    public int compareTo(Profile SecondProfile) {
    return result.compareTo(SecondProfile.result);
    }
}
