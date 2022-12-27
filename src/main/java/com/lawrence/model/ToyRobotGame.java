package com.lawrence.model;

import com.lawrence.enumerate.Direction;
import com.lawrence.enumerate.RotateOption;


public class ToyRobotGame {
    private final Table table;
    private Robot robot;

    private Coordinate robotCoordinate;

    public ToyRobotGame(int size) {
        table = new Table(size);
    }


    public void placeRobot(Coordinate coordinate, Direction direction) {
        changeCoordinate(coordinate);
        robot = Robot.builder()
                .direction(direction)
                .build();

    }

    public void rotateRobot(RotateOption rotateOption) {
        robot.rotate(rotateOption);
    }

    public void report() {
        System.out.println(this);
    }

    public void move() {
        Coordinate newCoordinate = robotCoordinate.move(robot.getDirection());
        changeCoordinate(newCoordinate);
    }

    private void changeCoordinate(Coordinate coordinate) {
        if (!table.isOnTable(coordinate)) {
            return;
        }
        robotCoordinate = coordinate;
    }

    @Override
    public String toString() {
        return robotCoordinate + "," + robot;
    }
}
