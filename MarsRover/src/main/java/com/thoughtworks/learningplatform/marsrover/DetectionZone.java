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

    public boolean contains(Position position) {
        return position.abscissa <= abscissaAxis
                && position.ordinate <= ordinateAxis;
    }

    @Value
    public static class Position {
        private int abscissa;
        private int ordinate;

        public Position(int abscissa, int ordinate) {
            assert abscissa >= 0;
            assert ordinate >= 0;
            this.abscissa = abscissa;
            this.ordinate = ordinate;
        }
    }
}
