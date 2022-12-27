package com.lawrence.model;

import com.lawrence.enumerate.Direction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Robot {

    private Coordinate coordinate;
    private Direction direction;

    @Override
    public String toString() {
        return String.format("%d,%d,%s", coordinate.getXAxis(), coordinate.getYAxis(), direction);
    }
}
