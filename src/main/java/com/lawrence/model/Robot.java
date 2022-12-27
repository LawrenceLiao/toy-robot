package com.lawrence.model;

import com.lawrence.enumerate.Direction;
import com.lawrence.enumerate.RotateOption;
import lombok.Builder;
import lombok.Value;


@Value
@Builder(toBuilder = true)
public class Robot {

    Coordinate robotCoordinate;
    Direction direction;

    public Robot rotate(RotateOption rotateOption) {
        Direction rotatedDirection = Direction.rotate(direction, rotateOption);
        return this.toBuilder().direction(rotatedDirection).build();
    }

    public Robot moveForward() {
        Coordinate movedCoordinate = robotCoordinate.move(direction);
        return this.toBuilder().robotCoordinate(movedCoordinate).build();
    }

    @Override
    public String toString() {
        return robotCoordinate + "," + direction;
    }
}
