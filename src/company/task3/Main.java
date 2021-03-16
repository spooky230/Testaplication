package company.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //here we use static functions
        int holder = inPutAge();
        showAgeGroup(holder);
        showLicense(holder);
        //here we will use object method
        AgeTask agetask = new AgeTask();
        holder = agetask.InPutAge();
        agetask.ageGroup(holder);
        agetask.License(holder);
    }
    public static int inPutAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = scanner.nextInt();
        return age;
    }

    public static void showAgeGroup(int age) {
        if (age < 0) {
            System.out.println("age can't  be a negetive number");
        }
        if (age >= 0 && age <= 12) {
            System.out.println("You are a child");
        } else if (age >= 13 && age <= 17) {
            System.out.println("You are a teenager");
        } else if (age >= 18 && age <= 22) {
            System.out.println("You are a student");
        } else if (age >= 23) {
            System.out.println("You are an adult");
        }
    }

    public static void showLicense(int age) {
        if (age >= 0 && age <= 17) {
            System.out.println("You can't get any licesnses");
        }
        if (age >= 18) {
            System.out.println("You can get car licesnse" +
                    " and bike licesnse");
        }
        if (age >= 21) {
            System.out.println("you can get buss licenses");
            System.out.println("you can get truck licenses");
        }
        if (age >= 24) {
            System.out.println("you can get tractor licenses");
        }
    }
}