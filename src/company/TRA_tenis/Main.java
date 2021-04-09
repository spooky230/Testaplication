package company.TRA_tenis;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TenisPlayer player1 = new TenisPlayer("Tony","Chimpo","Uk","4/8/1983");
        TenisPlayer player2 = new TenisPlayer("George","Shaltor","Sweden","1/16/1973");
        TenisPlayer player3 = new TenisPlayer("Sara","Verko","Spain","9/1/1995");
        TenisPlayer player4 = new TenisPlayer("Josh","Berkovech","south Korea","4/8/1992");
        TenisPlayer player5 = new TenisPlayer("Steve","Kapalo","Mexico","2/23/1981");
        SeasonResults player1Res = new SeasonResults(10,10,39);
        SeasonResults player2Res = new SeasonResults(12,8,32);
        SeasonResults player3Res = new SeasonResults(15,5,54);
        SeasonResults player4Res = new SeasonResults(4,16,15);
        SeasonResults player5Res = new SeasonResults(8,12,28);
        System.out.println((player1Res.scoreCounter()));
        System.out.println((player2Res.scoreCounter()));
        System.out.println((player3Res.scoreCounter()));
        System.out.println((player4Res.scoreCounter()));
        System.out.println((player5Res.scoreCounter()));
        Map<TenisPlayer,SeasonResults>PlayerResults = new HashMap<>();
        PlayerResults.put(player1,player1Res);
        PlayerResults.put(player2,player2Res);
        PlayerResults.put(player3,player3Res);
        PlayerResults.put(player4,player4Res);
        PlayerResults.put(player5,player5Res);
        System.out.println("Name           Last name           Country           DOB          Wins   Loses  Goals  Score");
        for (Map.Entry<TenisPlayer,SeasonResults> entry : PlayerResults.entrySet()){
            System.out.printf("|%-14s|%-19s|%-17s|%-10s|%6d|%6d|%6d|%6d|%n",
                    entry.getKey().getFirstName(),
                    entry.getKey().getLastName(),
                    entry.getKey().getCountry(),
                    entry.getKey().getDateAsString(),
                    entry.getValue().getWins(),
                    entry.getValue().getLoses(),
                    entry.getValue().getGoals(),
                    entry.getValue().scoreCounter());
        }

//        Map<SeasonResults,TenisPlayer>sort = new TreeMap<>();
//
//        for (Map.Entry<TenisPlayer,SeasonResults> entry : PlayerResults.entrySet()){
//            sort.put(entry.getValue(), entry.getKey());
//        }
}
}

