package com.lawrence.executor;

import com.lawrence.enumerate.Direction;
import com.lawrence.enumerate.RotateOption;
import com.lawrence.playground.ToyRobotGame;

import java.util.List;

public class RightExecutor implements Executor {
    @Override
    public void execute(ToyRobotGame toyRobotGame, List<String> parameter) {
        Direction rotatedDirection = Direction.rotate(toyRobotGame.getRobot().getDirection(), RotateOption.RIGHT);
        toyRobotGame.getRobot().setDirection(rotatedDirection);
    }
}
