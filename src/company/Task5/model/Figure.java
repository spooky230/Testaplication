package company.Task5.model;

import company.Task5.exception.CalculationNotImplementedException;
import company.Task5.exception.InvalidSizeException;

import java.util.LinkedList;
import java.util.List;

public abstract class Figure {
    protected int edgesCount;
    protected List<Double> edges = new LinkedList<>();

    public abstract double calculateArea() throws CalculationNotImplementedException;

    public double calculatePerimeter(){
        double edgesPlused = 0;
        for (int i = 0; i < edgesCount; i++) {
            edgesPlused = edgesPlused + edges.get(i);
        }
        return edgesPlused;

    }
    public void Check() throws InvalidSizeException {
        double Pe = calculatePerimeter();
        for (int i = 0; i <edgesCount; i++) {
            if(edges.get(i)>=Pe-edges.get(i)){
                throw new InvalidSizeException("One edge is equal or greater than sum of other edges");
            }
            if (edges.get(i)<=0)
                throw new InvalidSizeException("one or more edges are equal or less than 0");
        }
    }
    protected Figure(List<Double>edges) throws InvalidSizeException {
        this.edges=edges;
        this.edgesCount=edges.size();
        Check();
    }

    public int getEdgesCount() {
        return edgesCount;
    }

    public List<Double> getEdges() {
        return edges;
    }
}
