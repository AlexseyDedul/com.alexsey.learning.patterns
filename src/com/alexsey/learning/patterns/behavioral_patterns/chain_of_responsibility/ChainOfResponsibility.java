package com.alexsey.learning.patterns.behavioral_patterns.chain_of_responsibility;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        Handler repeater = new Repeater();

        repeater.bind(new Taxi("1234"))
                .bind(new Taxi("1235"))
                .bind(new Taxi("1236"))
                .bind(new Taxi("1237"))
                .bind(repeater);

        Order order = new Order("#1");
        repeater.handle(order);
    }
}
