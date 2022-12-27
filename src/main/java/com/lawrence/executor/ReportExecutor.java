package com.lawrence.executor;

import com.lawrence.model.ToyRobotGame;

import java.util.List;

public class ReportExecutor implements Executor {
    @Override
    public void execute(ToyRobotGame toyRobotGame, List<String> parameter) {
        toyRobotGame.report();
    }
}
