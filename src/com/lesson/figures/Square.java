package com.lesson.figures;

public class Square implements Area {
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public double calculateArea() {
        return Math.pow(edge, 2);
    }
}
