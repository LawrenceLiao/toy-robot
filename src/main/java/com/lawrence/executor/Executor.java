package com.lawrence.executor;

import com.lawrence.model.ToyRobotGame;

import java.util.List;

public interface Executor {
    void execute(ToyRobotGame toyRobotGame, List<String> parameter);
}
