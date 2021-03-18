package company.Task5.model;

import company.Task5.exception.InvalidSizeException;

import java.util.List;

public class Square extends Figure{

    public Square(List<Double> edges) throws InvalidSizeException {
        super(edges);
    }
    @Override
    public double calculateArea() {
        double squareArea = Math.pow(edges.get(1),2);
        return squareArea;
    }
}
