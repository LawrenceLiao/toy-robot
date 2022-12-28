package com.lawrence.model;

import com.lawrence.enumerate.Direction;
import com.lawrence.enumerate.RotateOption;


public class ToyRobotGame {
    private final Table table;
    private Robot robot;

    public ToyRobotGame(int size) {
        table = new Table(size);
    }


    public void placeRobot(Location location, Direction direction) {
        if (!table.isOnTable(location)) {
            return;
        }
        robot = Robot.builder()
                .robotLocation(location)
                .direction(direction)
                .build();

    }

    public void rotateRobot(RotateOption rotateOption) {
        robot.rotate(rotateOption);
    }

    public void report() {
        System.out.println(robot);
    }

    public void move() {
        robot.moveForward(table);
    }
    
}
