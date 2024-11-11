package com.alexsey.learning.patterns.behavioral_patterns.template_method;

public abstract class SocialNetwork {
    private final String login;
    private final String password;

    public SocialNetwork(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createPost(String message){
        boolean authSuccessfully = login(login, password);
        if (authSuccessfully){
            publish(message);
            logout();
        }

    }

    abstract boolean login(String login, String password);

    abstract void publish(String message);

    abstract void logout();
}
