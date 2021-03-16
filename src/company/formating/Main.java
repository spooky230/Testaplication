package company.formating;
//%s -- for String variable
//%S -- converting string to uppercase before inserting
//%n -- new line
//%d -- integer
//%f -- decimal
public class Main {
    public static void main(String[] args) {
       /* String stringVar = "John Doe";
        String stringVar2 = "John Johnson";
        final String name = "name = %s%n";
        String output = String.format(name,stringVar);
        System.out.println(output);
        output = String.format(name,stringVar2);
        System.out.println(output);
        String position1 = "top manager";
        String position2 = "Java developer";
        final String name_and_position = "%s is a %s";
        output = String.format(name_and_position,stringVar,position1);
        System.out.println(output);
        output = String.format(name_and_position,stringVar2,position2);
        System.out.println(output);
        int salary1 = 50000;
        int salary2 = 1500;
        final String name_position_and_salary = "%s is a %s and his(her) salary is $%d";
        output = String.format(name_position_and_salary,stringVar,position1,salary1);
        System.out.println(output);
        output = String.format(name_position_and_salary,stringVar2,position2,salary2);
        System.out.println(output);*/
        final String citizenship = "|%-20s| is a citizen of| %-30.30s|%n";
        String name1 = "John Doe";
        String name2 = "John Johnson";
        String country1 = "USA";
        String country2 = "Great Britain";
        System.out.printf(citizenship,name1,country1);
        System.out.printf(citizenship,name2,country2);
        //DescribeWeather();
    }
    public static void DescribeWeather(){
        // on %s the weather will be %s and temperature will be %d
        String dayOfWeek = "monday";
        String weather = "cloudy";
        int temperature = 12;
        final String general = "on %s the weather will be %s and temperature will be %d";
        String output = String.format(general,dayOfWeek,weather,temperature);
        System.out.println(output);
    }
}
