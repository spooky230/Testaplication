package com.lesson.interfaces.model.line;

import com.lesson.interfaces.exception.TooHardcoreCalculationException;

public interface Line {
    double length() throws TooHardcoreCalculationException;
}
