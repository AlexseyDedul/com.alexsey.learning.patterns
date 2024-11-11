package com.alexsey.learning.patterns.generating_patterns.factory;

public class SimpleFactory {

    public static class User{
        @Override
        public String toString() {
            return "User{}";
        }
    }

    public static class Admin extends User{
        @Override
        public String toString() {
            return "Admin{}";
        }
    }

    public static class Proger extends User{
        @Override
        public String toString() {
            return "Proger{}";
        }
    }

    public enum UserType{
        ADMIN,
        PROGER
    }

    public static class UserFactory{
        public User createUser(UserType userType){
            switch (userType){
                case ADMIN -> {
                    return new Admin();
                }
                case PROGER -> {
                    return new Proger();
                }
                default -> {
                    throw new UnsupportedOperationException();
                }
            }
        }
    }

    public static void main(String... args){
        UserFactory userFactory = new UserFactory();
        System.out.println(userFactory.createUser(UserType.ADMIN));
        System.out.println(userFactory.createUser(UserType.PROGER));
    }
}
