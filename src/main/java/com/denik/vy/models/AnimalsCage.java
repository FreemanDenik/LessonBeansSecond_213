package com.denik.vy.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    @Autowired
    @Qualifier("Dog")
    public Animal animal;

    @Autowired
    private Timer timer;
    public Timer getTimer(){
        return timer;
    }
    public String animalSay(){
        return animal.toString() + " " + timer.getTime();
    }
}
