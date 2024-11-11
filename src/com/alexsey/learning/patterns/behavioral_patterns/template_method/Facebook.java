package com.alexsey.learning.patterns.behavioral_patterns.template_method;

public class Facebook extends SocialNetwork{

    public Facebook(String login, String password) {
        super(login, password);
    }

    @Override
    boolean login(String login, String password) {
        System.out.println("Login to Facebook.");
        return true;
    }

    @Override
    void publish(String message) {
        System.out.printf("Publish message %s\n", message);
    }

    @Override
    void logout() {
        System.out.println("Logout from Facebook");
    }
}
