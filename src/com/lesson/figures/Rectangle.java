package com.lesson.figures;

import java.io.Serializable;

public class Rectangle implements Area, Cloneable, Serializable {
    private double edgeA;
    private double edgeB;

    public Rectangle(double edgeA, double edgeB) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
    }

    @Override
    public double calculateArea() {
        return edgeA * edgeB;
    }
}
