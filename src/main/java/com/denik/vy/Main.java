package com.denik.vy;

import com.denik.vy.configs.AppConfig;
import com.denik.vy.models.AnimalsCage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        for(int i = 0; i < 5; i++) {
            AnimalsCage animalsCage = context.getBean(AnimalsCage.class);
            System.out.println(animalsCage.animalSay());
        }
    }
}