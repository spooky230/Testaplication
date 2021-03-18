package company.Task5.model;

import company.Task5.exception.CalculationNotImplementedException;
import company.Task5.exception.InvalidSizeException;

import java.util.List;

public class OtherPolygon extends Pentagon{
    public OtherPolygon(List<Double> edges) throws InvalidSizeException {
        super(edges);
    }
}
