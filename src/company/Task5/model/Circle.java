package company.Task5.model;

import company.Task5.exception.CalculationNotImplementedException;
import company.Task5.exception.InvalidSizeException;

import java.util.List;

public class Circle extends Figure{
    public Circle(List<Double> edges) throws InvalidSizeException {
        super(edges);
    }

    @Override
    public double calculatePerimeter() {
        double circlePerimeter = 2*Math.PI*edges.get(0);
        return circlePerimeter;
    }

    @Override
    public void Check() throws InvalidSizeException {
        if (edges.get(0)<=0)
            throw new InvalidSizeException("one or more edges are equal or less than 0");
    }

    @Override
    public double calculateArea() throws CalculationNotImplementedException {
        double circleArea = Math.PI * Math.pow(edges.get(0),2);
        return circleArea;
    }
}
