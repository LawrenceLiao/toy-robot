package com.lawrence.executor;

import com.lawrence.enumerate.Direction;
import com.lawrence.model.Location;
import com.lawrence.model.ToyRobotGame;

import java.util.List;

public class PlaceExecutor implements Executor {
    @Override
    public void execute(ToyRobotGame toyRobotGame, List<String> parameter) {
        if (parameter == null || parameter.size() < 3) {
            throw new IllegalArgumentException("No parameter attached, please contact Fiona");
        }

        Location location = Location.builder()
                .xAxis(Integer.parseInt(parameter.get(0)))
                .yAxis(Integer.parseInt(parameter.get(1)))
                .build();
        Direction direction = Direction.valueOf(parameter.get(2));

       toyRobotGame.placeRobot(location, direction);
    }
}
