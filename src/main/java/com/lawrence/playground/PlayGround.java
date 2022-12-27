package com.lawrence.playground;

import com.lawrence.enumerate.Direction;
import com.lawrence.enumerate.RotateOption;
import com.lawrence.model.Command;
import com.lawrence.model.Coordinate;
import com.lawrence.model.Robot;
import com.lawrence.model.Table;

import static com.lawrence.enumerate.RotateOption.LEFT;
import static com.lawrence.enumerate.RotateOption.RIGHT;


public class PlayGround {
    private Table table;
    private Robot robot;

    public PlayGround(int size) {
        table = new Table(size);
    }
    public void executeCommand(Command command) {
        switch (command.commandType()) {
            case PLACE -> placeRobot(command);
            case MOVE -> move();
            case LEFT -> turnLeft();
            case RIGHT -> turnRight();
            case REPORT -> report();
            default -> throw new IllegalArgumentException("Please contact Fiona for learning coding again as you can't even type correct input");
        }
    }
    private void placeRobot(Command command) {
        Coordinate coordinate = Coordinate.builder()
                .xAxis(Integer.valueOf(command.parameters().get(0)))
                .yAxis(Integer.valueOf(command.parameters().get(1)))
                .build();

        if (!table.isOnTable(coordinate)) {
            return;
        }

        robot = Robot.builder()
                .coordinate(coordinate)
                .direction(Direction.valueOf(command.parameters().get(2)))
                .build();
    }

    private void move() {
        Coordinate newCoordinate = robot.getCoordinate().move(robot.getDirection());
        if (!table.isOnTable(newCoordinate)) {
            return;
        }
        robot.setCoordinate(newCoordinate);
    }

    private void turnLeft() {
        Direction rotatedDirection = rotate(LEFT);
        robot.setDirection(rotatedDirection);
    }

    private void turnRight() {
        Direction rotatedDirection = rotate(RIGHT);
        robot.setDirection(rotatedDirection);
    }

    private void report() {
        System.out.println(robot);
    }

    private Direction rotate(RotateOption rotateOption) {
        int ordinal = (robot.getDirection().ordinal() + rotateOption.ordinalChange + 4) % 4;
        return Direction.getDirection(ordinal);
    }
}
