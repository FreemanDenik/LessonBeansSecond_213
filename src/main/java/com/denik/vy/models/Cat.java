package com.denik.vy.models;


import org.springframework.stereotype.Component;

@Component("Cat")
public class Cat extends Animal {
    public String toString(){
        return "i'm cat";
    }
}
