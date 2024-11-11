package com.alexsey.learning.patterns.behavioral_patterns.template_method;

public class Main {
    public static void main(String[] args) {
        SocialNetwork vk = new VK("vkLogin", "qwerty");
        vk.createPost("Post 1");

        SocialNetwork facebook = new Facebook("facebookLogin", "qwerty");
        facebook.createPost("Post 2");
    }
}
