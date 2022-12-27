package com.lawrence.model;

import lombok.Getter;

@Getter
public class Table {

    private int length;

    private int width;

    public Table(int value) {
        length = value;
        width = value;
    }

    public boolean isOnTable(Coordinate coordinate) {
        return coordinate.getXAxis() >= 0 && coordinate.getXAxis() < length
                && coordinate.getYAxis() >= 0 && coordinate.getYAxis() < width;
    }
}
