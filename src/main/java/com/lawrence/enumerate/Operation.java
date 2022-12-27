package com.lawrence.enumerate;

import com.lawrence.executor.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.function.Supplier;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Operation {
    PLACE(PlaceExecutor::new),
    MOVE(MoveExecutor::new),
    LEFT(LeftExecutor::new),
    RIGHT(RightExecutor::new),
    REPORT(ReportExecutor::new);

    public final Supplier<Executor> executorFactory;
}
