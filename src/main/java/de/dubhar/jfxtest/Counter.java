package de.dubhar.jfxtest;

import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Counter {

    @Getter
    private int count = 0;

    public void update() {
        count++;
    }
}
