package com.lesson.interfaces.model.line;

import com.lesson.interfaces.exception.TooHardcoreCalculationException;
import com.lesson.interfaces.model.Space;
import com.lesson.interfaces.model.plot.Plot3d;

public class Line3d implements Line, Space {
    private Plot3d a;
    private Plot3d b;

    public Line3d(Plot3d a, Plot3d b) {
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

    public Plot3d getA() {
        return a;
    }

    public void setA(Plot3d a) {
        this.a = a;
    }

    public Plot3d getB() {
        return b;
    }

    public void setB(Plot3d b) {
        this.b = b;
    }
}
