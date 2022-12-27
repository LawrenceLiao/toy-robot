package com.lawrence.playground;

import com.lawrence.executor.Executor;
import com.lawrence.model.Command;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlayGround {
    private final ToyRobotGame game;

    public void play(Command command) {
        Executor executor = command.operation().executorFactory.get();
        executor.execute(game, command.parameters());
    }
}
