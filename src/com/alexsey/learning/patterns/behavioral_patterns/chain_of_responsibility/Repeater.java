package com.alexsey.learning.patterns.behavioral_patterns.chain_of_responsibility;

public class Repeater extends Handler{
    private Order order;

    @Override
    public void handle(Order order) {
        if(this.order == order){
            System.out.println("All cars are busy.");
        }else{
            this.order = order;
        }
        super.handle(order);
    }
}
