package com.alexsey.learning.patterns.behavioral_patterns.chain_of_responsibility;

public class Taxi extends Handler {
    private final String number;

    public Taxi(String number) {
        this.number = number;
    }

    @Override
    public void handle(Order order) {
        if(isBusy()){
            System.out.printf("Car # %s is busy.\n", number);
            super.handle(order);
        }else {
            System.out.printf("Car # %s can take the order.\n", number);
        }
    }

    private boolean isBusy(){
        return Math.random() <= 0.85;
    }
}
