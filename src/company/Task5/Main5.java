package company.Task5;

import company.Task5.exeption.InvalidSizeException;
import company.Task5.model.Triangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Triangle triangle = null;
        try {
            triangle = new Triangle(Arrays.asList(5.0,20.0,6.0));
            double perimeter = triangle.calculatePerimeter();
            System.out.println(perimeter);
            double area = triangle.calculateArea();
            System.out.println(area);
        } catch (InvalidSizeException e) {
            e.printStackTrace();
        }
    }
}
