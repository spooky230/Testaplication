package com.map_i18n.service;

import com.map_i18n.config.PropertiesConstants;
import company.Task4.Car;

import java.util.List;
import java.util.Scanner;

public class CarFilters {
    public void filterCarsPrice(List<company.Task4.Car> cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(PropertiesConstants.getProperty(PropertiesConstants.INPUT_PRICE));
        int carBudget = scanner.nextInt();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getCost() <= carBudget) {
                System.out.println(cars.get(i).getColor());
                System.out.println(cars.get(i).getCost());
                System.out.println(cars.get(i).getName());
            }

        }
    }

    public void filterCarsByColor(List<company.Task4.Car> cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(PropertiesConstants.getProperty(PropertiesConstants.INPUT_COLOR));
        String carColor = scanner.nextLine();
        for (company.Task4.Car car : cars) {
            if (car.getColor().equals(carColor)) {
                System.out.println(car.getColor());
                System.out.println(car.getCost());
                System.out.println(car.getName());
            }

        }
    }

    public void ShowAll(List<company.Task4.Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getColor());
            System.out.println(car.getCost());
            System.out.println(car.getName());
        }
    }
}