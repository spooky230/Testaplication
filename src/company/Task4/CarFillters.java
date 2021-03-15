package company.Task4;

import java.util.List;
import java.util.Scanner;

public class CarFillters {
    public void fillterCarsPrice(List<Car> cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your budget: ");
        int carBudget = scanner.nextInt();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getCost() <= carBudget) {
                System.out.println(cars.get(i).getColor());
                System.out.println(cars.get(i).getCost());
                System.out.println(cars.get(i).getName());
            }

        }
    }

    public void fillterCarsByColor(List<Car> cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input needed color: ");
        String carColor = scanner.nextLine();
        for (Car car : cars) {
            if (car.getColor().equals(carColor)) {
                System.out.println(car.getColor());
                System.out.println(car.getCost());
                System.out.println(car.getName());
            }

        }
    }

    public void ShowAll(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getColor());
            System.out.println(car.getCost());
            System.out.println(car.getName());
        }
    }
}