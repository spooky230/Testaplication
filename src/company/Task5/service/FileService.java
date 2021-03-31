package company.Task5.service;

import company.Task4.Car;
import company.Task5.exception.InvalidSizeException;
import company.Task5.model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    public void saveAllFigures(List<Figure> figures){
        try(FileWriter writer = new FileWriter(FILE)){
            for (int i = 0; i<figures.size();i++) {
                String figureToString = figureToString(figures.get(i));
                writer.append(figureToString + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    public String figureToString(Figure figure) {
        String result = "";
        for (int i = 0; i <figure.getEdgesCount() ; i++) {
            result = result + figure.getEdges().get(i) + " ";
        }
        result = result.trim();
        return result;
    }
    public static final String FILE
            = "Figures.txt";
//    triangle = new Triangle(Arrays.asList(5.0,7.0,6.0));
//    double perimeter = triangle.calculatePerimeter();
//            System.out.println(perimeter);
//    double area = triangle.calculateArea();
//            System.out.println(area + "\n");
    public List<Figure> getAllFigures() {
        List<Figure> figures = new ArrayList<>();
        String file = getClass().getClassLoader().getResource(FILE).getFile();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
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
        finally {
            System.out.println("do anyway");
        }
        return figures;
    }
}