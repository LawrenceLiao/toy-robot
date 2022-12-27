package com.lawrence.model;

import com.lawrence.enumerate.CommandType;
import lombok.Builder;

import java.util.List;

@Builder
public record Command(CommandType commandType, List<String> parameters) {
}
