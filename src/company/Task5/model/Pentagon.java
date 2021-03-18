package company.Task5.model;
import company.Task5.exception.CalculationNotImplementedException;
import company.Task5.exception.InvalidSizeException;
import java.util.List;

public class Pentagon extends Figure{
    public Pentagon(List<Double> edges) throws InvalidSizeException {
        super(edges);
    }

    @Override
    public double calculateArea() throws CalculationNotImplementedException {
        for (int i = 0; i < edgesCount; i++) {
            if(!edges.get(i).equals(edges.get(1))){
                throw new CalculationNotImplementedException();
            }
        }
        double pentagonArea = (edgesCount*Math.pow(edges.get(1),2))/(4 * Math.tan(360/(2*edgesCount)));
        return pentagonArea;
    }
}
