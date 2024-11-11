package com.alexsey.learning.patterns.behavioral_patterns.chain_of_responsibility;

public class Order {
    private final String id;

    public Order(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
