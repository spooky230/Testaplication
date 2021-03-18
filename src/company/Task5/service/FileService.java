package company.Task5.service;

import company.Task5.exception.InvalidSizeException;
import company.Task5.model.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    public static final String FILE
            = "C:\\Users\\spook\\IdeaProjects\\Testaplication\\resources\\Figures.txt";
//    triangle = new Triangle(Arrays.asList(5.0,7.0,6.0));
//    double perimeter = triangle.calculatePerimeter();
//            System.out.println(perimeter);
//    double area = triangle.calculateArea();
//            System.out.println(area + "\n");
    public static List<Figure> getAllFigures() {
        List<Figure> figures = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            while (reader.ready()) {
                String figureLine = reader.readLine();
                String[] parts = figureLine.split(" ");
                List<Double>edges = new ArrayList<>();
                for (int i = 0; i < parts.length; i++) {
                    double num = Double.parseDouble(parts[i]);
                    edges.add(num);
                }
                if(parts.length==3){
                    Triangle triangle = new Triangle(edges);
                    figures.add(triangle);
                }
                if(parts.length==4){
                    Square square = new Square(edges);
                    figures.add(square);
                }
                if(parts.length==1){
                    Circle circle = new Circle(edges);
                    figures.add(circle);
                }
                if(parts.length==5){
                    Pentagon pentagon = new Pentagon(edges);
                    figures.add(pentagon);
                }
                if(parts.length>5){
                    OtherPolygon otherPolygon = new OtherPolygon(edges);
                    figures.add(otherPolygon);
                }
                else{
                    System.out.println("temporary ignored");
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidSizeException e) {
            e.printStackTrace();
        }
        return figures;
    }
}