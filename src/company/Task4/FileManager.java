package company.Task4;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
public class FileManager {
    public static final String FILE = "C:\\Users\\spook\\IdeaProjects\\Testaplication\\resources\\cars.txt";
    public static final String car_FILE_OUTPUT_TEMPLATE = "%s/%d/%s%n";
    public static void savecars(List<Car> cars)  {
        try (FileWriter writer = new FileWriter(FILE)){
            for (Car car : cars) {
                String format = String.format(car_FILE_OUTPUT_TEMPLATE,
                        car.getName(),
                        car.getCost(),
                        car.getColor());
                writer.append(format);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Car> getAllcars() {
        List<Car> cars = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))){
            while (reader.ready()) {
                String line = reader.readLine();
                String[] parts = line.split("/");
                String name = parts[0];
                String color = parts[2];
                int cost = Integer.parseInt(parts[1]);
                Car car = new Car(name, color, cost);
                cars.add(car);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cars;
    }
}
