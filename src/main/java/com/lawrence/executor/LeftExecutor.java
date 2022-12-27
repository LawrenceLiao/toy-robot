package com.lawrence.executor;

import com.lawrence.enumerate.RotateOption;
import com.lawrence.model.ToyRobotGame;

import java.util.List;

public class LeftExecutor implements Executor {
    @Override
    public void execute(ToyRobotGame toyRobotGame, List<String> parameter) {
        toyRobotGame.rotateRobot(RotateOption.LEFT);
    }
}
