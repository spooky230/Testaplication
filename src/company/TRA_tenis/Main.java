package company.TRA_tenis;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Profile> Sprofile = createProfiles();
        System.out.println("1)full name  2)country 3)DOB 4)wins 5)loses 6)goals 7)score 8)games count\norder by: ");
        Scanner scanner = new Scanner(System.in);
        int byChoice = scanner.nextInt();
        System.out.println("1)ascending descending\norder type: ");
        int typeChoice = scanner.nextInt();
        Comparator<Profile> profileComparator = null;
        switch(byChoice){
            case 1:
                profileComparator = Comparator.comparing(profile -> profile.getPlayer().getFullName());
                break;
            case 2:
                profileComparator = (profile1, profile2) -> profile1.getPlayer().getCountry().compareTo(profile2.getPlayer().getCountry());
                break;
            case 3:
                profileComparator = (profile1, profile2) -> profile1.getPlayer().getBirthDate().compareTo(profile2.getPlayer().getBirthDate());
                break;
            case 4:
                profileComparator = (profile1, profile2) -> Integer.compare(profile1.getResult().getWins(),profile2.getResult().getWins());
                break;
            case 5:
                profileComparator = (profile1, profile2) -> Integer.compare(profile1.getResult().getLoses(),profile2.getResult().getLoses());
                break;
            case 6:
                profileComparator = (profile1, profile2) -> Integer.compare(profile1.getResult().getGoals(),profile2.getResult().getGoals());
                break;
            case 7:
                profileComparator = (profile1, profile2) -> Integer.compare(profile1.getResult().score(),profile2.getResult().score());
                break;
            case 8:
                profileComparator = Comparator.comparingInt(profile -> profile.getResult().totalGames());
                break;
            default:
                System.out.println("Incorrect choice");
        }
        List<Profile> sortedProfiles = new LinkedList<>(Sprofile);
        sortedProfiles.sort(profileComparator);
        printProfiles(sortedProfiles);
        ProfileService.profileWriter(sortedProfiles);
    }
    private static Set<Profile> createProfiles() {
        TenisPlayer player1 = new TenisPlayer("Tony","Chimpo","Uk","4/8/1983");
        TenisPlayer player2 = new TenisPlayer("George","Shaltor","Spain","1/16/1973");
        TenisPlayer player3 = new TenisPlayer("Sara","Verko","Spain","9/1/1995");
        TenisPlayer player4 = new TenisPlayer("Josh","Berkovech","South Korea","4/8/1992");
        TenisPlayer player5 = new TenisPlayer("Steve","Kapalo","Mexico","2/23/1981");
        TenisPlayer player6 = new TenisPlayer("James","Kapalo","Netherlands","2/9/1991");
        SeasonResults player1Res = new SeasonResults(10,10,39);
        SeasonResults player2Res = new SeasonResults(12,8,32);
        SeasonResults player3Res = new SeasonResults(15,5,54);
        SeasonResults player4Res = new SeasonResults(4,16,15);
        SeasonResults player5Res = new SeasonResults(8,12,28);
        SeasonResults player6Res = new SeasonResults(12,6,42);
        Profile profile1 = new Profile(player1,player1Res);
        Profile profile2 = new Profile(player2,player2Res);
        Profile profile3 = new Profile(player3,player3Res);
        Profile profile4 = new Profile(player4,player4Res);
        Profile profile5 = new Profile(player5,player5Res);
        Profile profile6 = new Profile(player6,player6Res);
//        Map<TenisPlayer,SeasonResults>PlayerResults = new HashMap<>();
//        PlayerResults.put(player1,player1Res);
//        PlayerResults.put(player2,player2Res);
//        PlayerResults.put(player3,player3Res);
//        PlayerResults.put(player4,player4Res);
//        PlayerResults.put(player5,player5Res);
        Set<Profile> Sprofile = new TreeSet<Profile>();
        Sprofile.add(profile1);
        Sprofile.add(profile2);
        Sprofile.add(profile3);
        Sprofile.add(profile4);
        Sprofile.add(profile5);
        Sprofile.add(profile6);
        return Sprofile;
    }
    private static void printProfiles(Collection<Profile> Sprofile) {
        System.out.println("Last name           first name           Country           DOB     Wins   Loses  Goals  Score");
        for (Profile profile : Sprofile){
            System.out.printf("|%-19s|%-14s|%-17s|%-10s|%6d|%6d|%6d|%6d|%n",
                    profile.getPlayer().getLastName(),
                    profile.getPlayer().getFirstName(),
                    profile.getPlayer().getCountry(),
                    profile.getPlayer().getDateAsString(),
                    profile.getResult().getWins(),
                    profile.getResult().getLoses(),
                    profile.getResult().getGoals(),
                    profile.getResult().score());
        }
    }
}

