package com.lawrence.executor;

import com.lawrence.enumerate.RotateOption;
import com.lawrence.model.ToyRobotGame;

import java.util.List;

public class RightExecutor implements Executor {
    @Override
    public void execute(ToyRobotGame toyRobotGame, List<String> parameter) {
        toyRobotGame.rotateRobot(RotateOption.RIGHT);
    }
}
