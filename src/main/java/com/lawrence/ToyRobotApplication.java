package com.lawrence;

import com.lawrence.model.Command;
import com.lawrence.parser.CommandParser;
import com.lawrence.playground.PlayGround;
import com.lawrence.playground.ToyRobotGame;
import com.lawrence.util.FileLoader;

import java.io.IOException;
import java.util.List;


public class ToyRobotApplication {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Please input your order file name.");
            System.exit(1);
        }
        List<String> inputs = new FileLoader().load(args[0]);
        List<Command> commands = new CommandParser().parse(inputs);

        ToyRobotGame toyRobotGame = new ToyRobotGame(5);
        PlayGround playGround = new PlayGround(toyRobotGame);

        commands.forEach(playGround::play);
    }

}
