package com.lesson.interfaces.model.plot;

public class Plot3d extends Plot2d{
    private double z;
    public Plot3d(double x, double y) {
        super(x, y);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
