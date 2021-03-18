package company.Task5.model;

import company.Task5.exception.InvalidSizeException;

import java.util.List;

public class Triangle extends Figure{

    public Triangle(List<Double> edges) throws InvalidSizeException {
        super(edges);
    }

    @Override
    public double calculateArea() {
    double p = calculatePerimeter()/2;
    double trinagleArea = p;
        for (int i = 0; i < 3; i++) {
                trinagleArea *= p - edges.get(i);
        }
        trinagleArea= Math.sqrt(trinagleArea);
        return trinagleArea;
    }
}
