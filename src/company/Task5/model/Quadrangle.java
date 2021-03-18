package company.Task5.model;

import company.Task5.exception.CalculationNotImplementedException;
import company.Task5.exception.InvalidSizeException;

import java.util.List;

public class Quadrangle extends Figure{
    protected Quadrangle(List<Double> edges) throws InvalidSizeException {
        super(edges);
    }

    @Override
    public double calculateArea() throws CalculationNotImplementedException {
        throw new CalculationNotImplementedException();
    }
}
