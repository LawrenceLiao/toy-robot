package com.lawrence.enumerate;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Direction {

    NORTH(0, 1),
    EAST(1, 0),
    SOUTH(0, -1),
    WEST(-1, 0);

    public int xAsis;
    public int yAxis;

    public static Direction getDirection(int ordinal) {
        if (ordinal < 0 || ordinal > Direction.values().length) {
            throw new IllegalArgumentException("Invalid ordinal for Direction");
        }
        return values()[ordinal];
    }

}
