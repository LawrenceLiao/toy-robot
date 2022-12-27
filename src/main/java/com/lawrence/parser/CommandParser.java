package com.lawrence.parser;

import com.lawrence.enumerate.Operation;
import com.lawrence.model.Command;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CommandParser {

    private static final String COMMANDS_PREFIX = "PLACE";
    private static final String COMMAND_SEPARATOR = " ";
    private static final String PARAMETER_SEPARATOR = ",";

    public List<Command> parse(List<String> inputs) {
        return inputs.stream()
                .dropWhile(input -> !input.startsWith(COMMANDS_PREFIX))
                .map(this::parseCommand)
                .collect(Collectors.toList());
    }

    private Command parseCommand(String text) {
        String[] array = text.trim().split(COMMAND_SEPARATOR);
        Operation operation = Operation.valueOf(array[0].trim());

        List<String> parameters = Collections.emptyList();
        if (array.length > 1) {
            parameters = getParameters(array[1]);
        }

        return Command.builder()
                .operation(operation)
                .parameters(parameters)
                .build();
    }

    private List<String> getParameters(String args) {
        return Arrays.stream(args.trim().split(PARAMETER_SEPARATOR)).toList();
    }
}
