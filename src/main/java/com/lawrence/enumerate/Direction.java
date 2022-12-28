package com.lawrence.enumerate;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Direction {

    NORTH(0, 1),
    EAST(1, 0),
    SOUTH(0, -1),
    WEST(-1, 0);

    public final int xOffset;
    public final int yOffset;

    public static Direction getDirection(int ordinal) {
        if (ordinal < 0 || ordinal > Direction.values().length) {
            throw new IllegalArgumentException("Invalid ordinal for Direction, please contact Fiona");
        }
        return values()[ordinal];
    }

    public static Direction rotate(Direction prevDirection, RotateOption rotateOption) {
        int ordinal = (prevDirection.ordinal() + rotateOption.ordinalChange + values().length) % values().length;
        return Direction.getDirection(ordinal);
    }

}
