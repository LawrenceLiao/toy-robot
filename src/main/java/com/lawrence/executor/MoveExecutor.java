package com.lawrence.executor;

import com.lawrence.model.ToyRobotGame;

import java.util.List;

public class MoveExecutor implements Executor {
    @Override
    public void execute(ToyRobotGame toyRobotGame, List<String> parameter) {
        toyRobotGame.move();
    }
}
