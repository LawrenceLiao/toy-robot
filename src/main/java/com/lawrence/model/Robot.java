package com.lawrence.model;

import com.lawrence.enumerate.Direction;
import com.lawrence.enumerate.RotateOption;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Robot {

    private Direction direction;

    public void rotate(RotateOption rotateOption) {
        direction = Direction.rotate(direction, rotateOption);
    }
    @Override
    public String toString() {
        return direction.toString();
    }
}
