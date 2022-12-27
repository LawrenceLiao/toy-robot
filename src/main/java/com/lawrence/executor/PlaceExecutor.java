package com.lawrence.executor;

import com.lawrence.enumerate.Direction;
import com.lawrence.model.Coordinate;
import com.lawrence.model.Robot;
import com.lawrence.playground.ToyRobotGame;

import java.util.List;

public class PlaceExecutor implements Executor {
    @Override
    public void execute(ToyRobotGame toyRobotGame, List<String> parameter) {
        if (parameter == null || parameter.size() < 3) {
            throw new IllegalArgumentException("No parameter attached, please contact Fiona");
        }

        Coordinate coordinate = Coordinate.builder()
                .xAxis(Integer.parseInt(parameter.get(0)))
                .yAxis(Integer.parseInt(parameter.get(1)))
                .build();

        if (!toyRobotGame.getTable().isOnTable(coordinate)) {
            return;
        }

        toyRobotGame.setRobot(Robot.builder()
                .coordinate(coordinate)
                .direction(Direction.valueOf(parameter.get(2)))
                .build());
    }
}
