package company.Task4;

import company.Task4.Car;
import company.Task4.CarFillters;
import company.Task4.FileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("Audi A5");
        car1.setColor("Black");
        car1.setCost(5000);
        Car car2 = new Car();
        car2.setName("car");
        car2.setColor("Yellow");
        car2.setCost(10000);
        Car car3 = new Car("Toyota","green",70000);
        System.out.println();
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        CarFillters fillter = new CarFillters();
//        fillter.fillterCarsPrice(carList);
//        fillter.fillterCarsByColor(carList);
        carList = FileManager.getAllcars();
        FileManager.savecars(carList);
        boolean until = true;
        while(until){
            Scanner scanner = new Scanner(System.in);
            System.out.printf(" 1 to view all information \n 2 for price filter \n 3 for color filter \n 4 to exit \n input:  ");
            int menu = scanner.nextInt();
//            if (menu == 1){
//                fillter.ShowAll(carList);
//            }
//            else if (menu == 2){
//                fillter.fillterCarsPrice(carList);
//            }
//            else if (menu == 3){
//                fillter.fillterCarsByColor(carList);
//            }
//            else if (menu == 4){
//                until=false;
//            }
            switch (menu){
                case 1 : fillter.ShowAll(carList);break;
                case 2 : fillter.fillterCarsPrice(carList);break;
                case 3 : fillter.fillterCarsByColor(carList);break;
                case 4 : until=false;break;
                default: System.out.println("Please input one of the options above ");
            }
        }
    }
}