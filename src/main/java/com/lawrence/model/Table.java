package com.lawrence.model;

import lombok.Getter;

@Getter
public class Table {

    private final int length;

    private final int width;

    public Table(int value) {
        length = value;
        width = value;
    }

    public boolean isOnTable(Location location) {
        return location.getXAxis() >= 0 && location.getXAxis() < length
                && location.getYAxis() >= 0 && location.getYAxis() < width;
    }
}
