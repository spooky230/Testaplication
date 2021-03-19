package com.lesson.interfaces.model.line;

import com.lesson.interfaces.exception.TooHardcoreCalculationException;
import com.lesson.interfaces.model.Space;
import com.lesson.interfaces.model.plot.Plot2d;

public class PlaneLine implements Line, Space {
    private Plot2d a;
    private Plot2d b;

    public PlaneLine(Plot2d a, Plot2d b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double length() throws TooHardcoreCalculationException {
        return 0;
    }

    @Override
    public String getSpaceName() {
        return "2-dimensional space";
    }
    public Plot2d getA() {
        return a;
    }

    public void setA(Plot2d a) {
        this.a = a;
    }

    public Plot2d getB() {
        return b;
    }

    public void setB(Plot2d b) {
        this.b = b;
    }

}
