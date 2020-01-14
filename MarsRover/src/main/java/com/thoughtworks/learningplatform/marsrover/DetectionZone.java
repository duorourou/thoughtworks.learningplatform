package com.thoughtworks.learningplatform.marsrover;

import lombok.Value;

@Value
public class DetectionZone {
    private int abscissaAxis;
    private int ordinateAxis;

    public DetectionZone(int abscissaAxis, int ordinateAxis) {
        assert abscissaAxis >= 0;
        assert ordinateAxis >= 0;
        this.abscissaAxis = abscissaAxis;
        this.ordinateAxis = ordinateAxis;
    }

    public boolean contains(Point point) {
        return point.abscissa <= abscissaAxis
                && point.ordinate <= ordinateAxis;
    }

    @Value
    public static class Point {
        private int abscissa;
        private int ordinate;

        public Point(int abscissa, int ordinate) {
            assert abscissa >= 0;
            assert ordinate >= 0;
            this.abscissa = abscissa;
            this.ordinate = ordinate;
        }
    }
}
