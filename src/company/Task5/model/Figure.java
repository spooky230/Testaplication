package company.Task5.model;

import company.Task5.exeption.InvalidSizeException;

import java.util.LinkedList;
import java.util.List;

public abstract class Figure {
    protected int edgesCount;

    protected List<Double> edges = new LinkedList<>();

    public abstract double calculateArea();
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
                throw new InvalidSizeException();
            }
        }
    }
    protected Figure(List<Double>edges) throws InvalidSizeException {
        this.edges=edges;
        this.edgesCount=edges.size();
        Check();
    }
}
