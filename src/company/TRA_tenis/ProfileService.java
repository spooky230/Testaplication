package company.TRA_tenis;

import company.Task4.Car;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

public class ProfileService {
    public static final String FILE = "C:\\Users\\Microsoft\\IdeaProjects\\Testaplication\\resources\\Player.txt";
    public static final String PROFILE_TEMPLATE = "%s|%s|%s|%s|%d|%d|%d|%n" ;
    public static void profileWriter(Collection<Profile> profileCollection){
        try (FileWriter writer = new FileWriter(FILE)){
            for (Profile profile : profileCollection) {
                String format = String.format(PROFILE_TEMPLATE,
                        profile.getPlayer().getLastName(),
                        profile.getPlayer().getFirstName(),
                        profile.getPlayer().getCountry(),
                        profile.getPlayer().getDateAsString(),
                        profile.getResult().getWins(),
                        profile.getResult().getLoses(),
                        profile.getResult().getGoals());


                writer.append(format);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
