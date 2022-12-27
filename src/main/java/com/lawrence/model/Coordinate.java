package com.lawrence.model;


import com.lawrence.enumerate.Direction;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class Coordinate {
    @Builder.Default
    int xAxis = 0;

    @Builder.Default
    int yAxis = 0;

    public Coordinate move(Direction direction) {
        return this.toBuilder()
                .xAxis(this.xAxis + direction.xAsis)
                .yAxis(this.yAxis + direction.yAxis)
                .build();
    }

    @Override
    public String toString() {
        return xAxis + "," + yAxis;
    }
}
