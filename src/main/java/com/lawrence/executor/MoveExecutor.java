package com.lawrence.executor;

import com.lawrence.model.Coordinate;
import com.lawrence.playground.ToyRobotGame;

import java.util.List;

public class MoveExecutor implements Executor {
    @Override
    public void execute(ToyRobotGame toyRobotGame, List<String> parameter) {
        Coordinate newCoordinate = toyRobotGame.getRobot().getCoordinate().move(toyRobotGame.getRobot().getDirection());
        if (!toyRobotGame.getTable().isOnTable(newCoordinate)) {
            return;
        }
        toyRobotGame.getRobot().setCoordinate(newCoordinate);
    }
}
