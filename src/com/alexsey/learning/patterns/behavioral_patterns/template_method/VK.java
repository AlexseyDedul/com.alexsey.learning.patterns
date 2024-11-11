package com.alexsey.learning.patterns.behavioral_patterns.template_method;

public class VK extends SocialNetwork{

    public VK(String login, String password) {
        super(login, password);
    }

    @Override
    boolean login(String login, String password) {
        System.out.println("Login to VK.");
        return true;
    }

    @Override
    void publish(String message) {
        System.out.printf("Publish message %s\n", message);
    }

    @Override
    void logout() {
        System.out.println("Logout from VK");
    }
}
