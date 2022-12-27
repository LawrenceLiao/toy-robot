package com.lawrence.model;

import com.lawrence.enumerate.Operation;
import lombok.Builder;

import java.util.List;

@Builder
public record Command(Operation operation, List<String> parameters) {
}
