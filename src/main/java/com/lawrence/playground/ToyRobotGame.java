package com.lawrence.playground;

import com.lawrence.model.Robot;
import com.lawrence.model.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
public class ToyRobotGame {
    private final Table table;
    @Setter
    private Robot robot;

    public ToyRobotGame(int size) {
        table = new Table(size);
    }

}
