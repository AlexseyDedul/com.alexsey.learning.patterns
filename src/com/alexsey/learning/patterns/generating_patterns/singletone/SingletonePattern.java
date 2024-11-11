package com.alexsey.learning.patterns.generating_patterns.singletone;

public class SingletonePattern {

    public static class Singletone{
        private static volatile Singletone instance;

        private Singletone(){
        }

        public static Singletone getInstance(){
            Singletone localInstance = instance;
            if (localInstance == null){
                synchronized (Singletone.class){
                    localInstance = instance;
                    if (localInstance == null){
                        instance = localInstance = new Singletone();
                    }
                }
            }
            return localInstance;
        }
    }

    public static void main(String[] args) {
        System.out.println(Singletone.getInstance());
    }
}
