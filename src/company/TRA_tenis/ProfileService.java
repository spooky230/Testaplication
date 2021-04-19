package company.TRA_tenis;

import company.Task4.Car;

import java.io.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

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
    public static List<Profile> getAllProfiles(){
        List<Profile> profiles = new LinkedList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(FILE))){
            while(reader.ready()) {
                String line = reader.readLine();
                String[] parts = line.split("\\|");
                String lastName = parts[0];
                String firstName = parts[1];
                String country = parts[2];
                String dateOfBirth = parts[3];
                int wins = Integer.parseInt(parts[4]);
                int loses = Integer.parseInt(parts[5]);
                int score = Integer.parseInt(parts[6]);
                TenisPlayer player = new TenisPlayer(firstName,lastName, country, dateOfBirth);
                SeasonResults seasonRes = new SeasonResults(wins, loses, score);
                Profile profile = new Profile(player, seasonRes);
                profiles.add(profile);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return profiles;
    }
}
