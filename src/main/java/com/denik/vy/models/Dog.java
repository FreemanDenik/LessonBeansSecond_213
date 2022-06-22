package com.denik.vy.models;

import org.springframework.stereotype.Component;

@Component("Dog")
public class Dog extends Animal{
    public String toString(){
        return "i'm dog";
    }
}
