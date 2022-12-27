package com.lawrence.enumerate;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum RotateOption {
    LEFT(-1),
    RIGHT(1);

    public int ordinalChange;
}
