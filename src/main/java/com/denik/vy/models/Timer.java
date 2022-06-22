package com.denik.vy.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Timer")
public class Timer {
    private long time = System.nanoTime();
    public long getTime(){
        return time;
    }
}
