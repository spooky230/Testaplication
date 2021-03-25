package com.map_i18n;

import com.map_i18n.config.ConstantsConfigurator;
import com.map_i18n.config.ConstantsMode;
import com.map_i18n.config.PropertiesConstants;
import com.map_i18n.service.CarFilters;
import company.Task4.Car;
import company.Task4.FileManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String,String> capitals = new HashMap<>();
        capitals.put("Russia","Moscow");
        capitals.put("UK","London");
        capitals.put("France","Paris");
        System.out.println(capitals.get("France"));
        capitals.keySet();
        capitals.values();
        capitals.entrySet();
        for (String key: capitals.keySet()){
            System.out.println(key);
        }
        for (String value: capitals.values()){
            System.out.println(value);
        }
        for (Map.Entry<String, String> entry: capitals.entrySet()){
            System.out.println(entry.toString());
        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("choose language: (en, ru, pl, he): ");
//        String locale = scanner.nextLine();
//        System.out.print("choose mode: (java_properties, hashmap): ");
//        String mode = scanner.nextLine();
//        ConstantsConfigurator.configure(locale, mode);
//        System.out.println(PropertiesConstants.getProperty(PropertiesConstants.GREETINGS));
//        company.Task4.Car car1 = new Car();
//        car1.setName("Audi A5");
//        car1.setColor("Black");
//        car1.setCost(5000);
//        company.Task4.Car car2 = new Car();
//        car2.setName("car");
//        car2.setColor("Yellow");
//        car2.setCost(10000);
//        company.Task4.Car car3 = new Car("Toyota","green",70000);
//        System.out.println();
//        List<Car> carList = new ArrayList<>();
//        carList.add(car1);
//        carList.add(car2);
//        carList.add(car3);
//        CarFilters filter = new CarFilters();
////        fillter.fillterCarsPrice(carList);
////        fillter.fillterCarsByColor(carList);
//        carList = FileManager.getAllcars();
//        FileManager.savecars(carList);
//        boolean until = true;
//        do {
//            System.out.println(PropertiesConstants.getProperty(PropertiesConstants.MENU));
//            int menu = scanner.nextInt();
////            if (menu == 1){
////                filter.ShowAll(carList);
////            }
////            else if (menu == 2){
////                filter.filterCarsPrice(carList);
////            }
////            else if (menu == 3){
////                filter.filterCarsByColor(carList);
////            }
////            else if (menu == 4){
////                until=false;
////            }
//            switch (menu) {
//                case 1:
//                    filter.ShowAll(carList);
//                    break;
//                case 2:
//                    filter.filterCarsPrice(carList);
//                    break;
//                case 3:
//                    filter.filterCarsByColor(carList);
//                    break;
//                case 4:
//                    until = false;
//                    break;
//                default:
//                    System.out.println(PropertiesConstants.getProperty(PropertiesConstants.INCORRECT_CHOICE));
//            }
//        } while (until);
//        System.out.println(PropertiesConstants.getProperty(PropertiesConstants.FINISH));
    }
}