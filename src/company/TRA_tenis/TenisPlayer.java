package company.TRA_tenis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TenisPlayer {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String country;
    public TenisPlayer(){

    }
    public TenisPlayer(String firstName, String lastName, String country, Date birthDate){
        this(firstName,lastName,country);
        this.birthDate = birthDate;
    }
    private static final String pattern = "MM/dd/yyyy";
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    public TenisPlayer(String firstName, String lastName, String country, String birthDate){
        this(firstName,lastName,country);
        try {
            this.birthDate = simpleDateFormat.parse(birthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    private TenisPlayer(String firstName, String lastName, String country){
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getCountry() {
        return country;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDateAsString(){
        String result = simpleDateFormat.format(birthDate);
        return result;
    }
}
