package com.lawrence.model;

import com.lawrence.enumerate.Direction;
import com.lawrence.enumerate.RotateOption;


public class ToyRobotGame {
    private final Table table;
    private Robot robot;

    public ToyRobotGame(int size) {
        table = new Table(size);
    }


    public void placeRobot(Coordinate coordinate, Direction direction) {
        if (!table.isOnTable(coordinate)) {
            return;
        }
        robot = Robot.builder()
                .robotCoordinate(coordinate)
                .direction(direction)
                .build();

    }

    public void rotateRobot(RotateOption rotateOption) {
        robot = robot.rotate(rotateOption);
    }

    public void report() {
        System.out.println(robot);
    }

    public void move() {
        Robot updatedRobot = robot.moveForward();
        moveRobot(updatedRobot);
    }

    private void moveRobot(Robot robot) {
        if (!table.isOnTable(robot.getRobotCoordinate())) {
            return;
        }
        this.robot = robot;
    }
}
