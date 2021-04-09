package company.TRA_tenis;

public class Profile implements Comparable <Profile>{
    private TenisPlayer player;
    private SeasonResults result;
    public Profile(){
    }
    public Profile(TenisPlayer player, SeasonResults result){
        this.player = player;
        this.result = result;
    }
    public TenisPlayer getPlayer() {
        return player;
    }

    public void setPlayer(TenisPlayer player) {
        this.player = player;
    }

    @Override
    public int compareTo(Profile SecondProfile) {

    }
}
