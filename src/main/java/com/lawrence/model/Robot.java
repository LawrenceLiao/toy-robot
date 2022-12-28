package com.lawrence.model;

import com.lawrence.enumerate.Direction;
import com.lawrence.enumerate.RotateOption;
import lombok.Builder;



@Builder(toBuilder = true)
public class Robot {

    private Location robotLocation;
    private Direction direction;

    public void rotate(RotateOption rotateOption) {
        direction= Direction.rotate(direction, rotateOption);
    }

    public void moveForward(Table table) {
        Location movedLocation = robotLocation.move(direction);
        if (!movedLocation.isOnTable(table)) {
            return;
        }
        robotLocation = movedLocation;
    }

    @Override
    public String toString() {
        return robotLocation + "," + direction;
    }
}
