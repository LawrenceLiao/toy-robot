package com.lawrence.executor;

import com.lawrence.playground.ToyRobotGame;

import java.util.List;

public interface Executor {
    void execute(ToyRobotGame toyRobotGame, List<String> parameter);
}
