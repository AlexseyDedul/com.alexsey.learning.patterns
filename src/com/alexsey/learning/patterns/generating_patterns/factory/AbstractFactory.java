package com.alexsey.learning.patterns.generating_patterns.factory;

public class AbstractFactory {
    public interface Pickup{
        void description();
    }

    public interface Suv{
        void description();
    }

    public static class ForPickup implements Pickup{

        @Override
        public void description() {
            System.out.println("Ford pickup");
        }
    }

    public static class PorschePickup implements Pickup{

        @Override
        public void description() {
            System.out.println("Porsche pickup");
        }
    }

    public static class FordSuv implements Suv{

        @Override
        public void description() {
            System.out.println("Ford suv");
        }
    }

    public static class PorscheSuv implements Suv{

        @Override
        public void description() {
            System.out.println("Porsche suv");
        }
    }

    public interface CarsFactory{
        Pickup createPickup();

        Suv createSuv();
    }

    public static class PorscheFactory implements CarsFactory{
        @Override
        public Pickup createPickup() {
            return new PorschePickup();
        }

        @Override
        public Suv createSuv() {
            return new PorscheSuv();
        }
    }

    public static class FordFactory implements CarsFactory{

        @Override
        public Pickup createPickup() {
            return new ForPickup();
        }

        @Override
        public Suv createSuv() {
            return new FordSuv();
        }
    }

    public static void main(String[] args) {
        CarsFactory porscheFactory = new PorscheFactory();
        Pickup porschePickup = porscheFactory.createPickup();
        porschePickup.description();

        CarsFactory fordFactory = new FordFactory();
        Suv fordSuv = fordFactory.createSuv();
        fordSuv.description();
    }
}
