package com.alexsey.learning.patterns.behavioral_patterns.observer;

public class Main {
    public static void main(String[] args) {
        NewPortal newPortal = new NewPortal();

        NewChannel newChannel1 = new NewChannel("First channel");
        newPortal.add(newChannel1);

        NewChannel newChannel2 = new NewChannel("Second channel");
        newPortal.add(newChannel2);

        newPortal.setNews("First news");
    }
}
