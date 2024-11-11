package com.alexsey.learning.patterns.behavioral_patterns.observer;

public class NewChannel implements Channel{

    private final String name;

    public NewChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.printf("%s, new message: %s\n", name, message);
    }
}
