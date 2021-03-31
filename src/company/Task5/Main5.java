package company.Task5;

import company.Task5.exception.CalculationNotImplementedException;
import company.Task5.exception.InvalidSizeException;
import company.Task5.model.*;
import company.Task5.service.FileService;

import java.util.*;

public class Main5 {
    public static void main(String[] args) throws InvalidSizeException {
        List<Figure> figures = new FileService().getAllFigures();
        for (int i = 0; i < figures.size(); i++) {
            System.out.println(i + "   " + figures.get(i).getClass().getName());            try {
                System.out.println(figures.get(i).calculateArea());
            } catch (CalculationNotImplementedException e) {
                e.printStackTrace();
            }
            System.out.println(figures.get(i).calculatePerimeter());

        }
        figures.add(new Circle(Collections.singletonList(5.)));
        new FileService().saveAllFigures(figures);
    }

}
