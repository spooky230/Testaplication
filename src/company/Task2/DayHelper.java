package company.Task2;

import java.util.Scanner;

public class DayHelper {
    public String inputDayName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day of the week: ");
        String dayOfTheWeek = scanner.nextLine();
        return dayOfTheWeek;
    }
    public void dayNumber(String dayOfTheWeek){
        int dayNumber = 0;
        final String general = "%s is day %d of the week %n";
        switch(dayOfTheWeek){
            case "Monday":dayNumber=1;break;
            case "Tuesday": dayNumber=2;break;
            case "Wednesday":dayNumber=3;break;
            case "Thursday": dayNumber=4;break;
            case "Friday": dayNumber=5;break;
            case "Saturday": dayNumber=6;break;
            case "Sunday": dayNumber=7;break;
            default: System.out.println("That day doesn't exist");break;
        }
        if(dayNumber!=0) {
            System.out.printf(general, dayOfTheWeek, dayNumber);
        }
        }
        public void dayType(String dayOfTheWeek){
        switch(dayOfTheWeek){
            case "Monday": System.out.println("Monday is a working day");break;
            case "Tuesday": System.out.println("Tuesday is a working day");break;
            case "Wednesday": System.out.println("Wednesday is a working day");break;
            case "Thursday": System.out.println("Thursday is a working day");break;
            case "Friday": System.out.println("Friday is a working day");break;
            case "Saturday": System.out.println("Saturday is a holiday");break;
            case "Sunday": System.out.println("Sunday is a holiday");break;
            default: System.out.println("That day doesn't exist");
        }
        }
    }


