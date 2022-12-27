package com.lawrence.playground;

import com.lawrence.executor.Executor;
import com.lawrence.model.Command;
import com.lawrence.model.ToyRobotGame;


public class PlayGround {
    private ToyRobotGame game;

    public void play(Command command) {
        Executor executor = command.operation().executorFactory.get();
        executor.execute(game, command.parameters());
    }

    public void initialise(int size) {
        game = new ToyRobotGame(size);
    }
}
