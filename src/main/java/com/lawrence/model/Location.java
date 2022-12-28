package com.lawrence.model;


import com.lawrence.enumerate.Direction;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class Location {
    @Builder.Default
    int xAxis = 0;

    @Builder.Default
    int yAxis = 0;

    public Location move(Direction direction) {
        return this.toBuilder()
                .xAxis(this.xAxis + direction.xOffset)
                .yAxis(this.yAxis + direction.yOffset)
                .build();
    }

    public boolean isOnTable(Table table) {
        return xAxis >= 0 && xAxis < table.getLength()
                && yAxis >= 0 && yAxis < table.getWidth();
    }

    @Override
    public String toString() {
        return xAxis + "," + yAxis;
    }
}
