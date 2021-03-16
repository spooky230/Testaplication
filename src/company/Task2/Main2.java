package company.Task2;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        DayHelper dayHelper = new DayHelper();
        String day = dayHelper.inputDayName();
        dayHelper.dayNumber(day);
        dayHelper.dayType(day);
    }
}
