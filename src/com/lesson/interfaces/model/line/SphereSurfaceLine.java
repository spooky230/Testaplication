package com.lesson.interfaces.model.line;

import com.lesson.interfaces.exception.TooHardcoreCalculationException;
import com.lesson.interfaces.model.Space;
import com.lesson.interfaces.model.plot.SphericalPlot;

public class SphereSurfaceLine implements Line, Space {
    private SphericalPlot a;
    private SphericalPlot b;

    public SphereSurfaceLine(SphericalPlot a, SphericalPlot b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getSpaceName() {
        return null;
    }

    @Override
    public double length() throws TooHardcoreCalculationException {
        return 0;
    }

    public SphericalPlot getA() {
        return a;
    }

    public void setA(SphericalPlot a) {
        this.a = a;
    }

    public SphericalPlot getB() {
        return b;
    }

    public void setB(SphericalPlot b) {
        this.b = b;
    }
}
