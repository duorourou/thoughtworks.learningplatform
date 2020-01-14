package com.thoughtworks.learningplatform.marsrover;

import lombok.Getter;

@Getter
public class MarsRover {

    private final DetectionZone.Position from;
    private DetectionZone.Position current;

    public MarsRover(DetectionZone.Position from) {
        this.from = from;
    }

}
