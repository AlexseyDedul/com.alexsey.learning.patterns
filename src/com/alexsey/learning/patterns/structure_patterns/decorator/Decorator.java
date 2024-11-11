package com.alexsey.learning.patterns.structure_patterns.decorator;

public class Decorator {
    public interface Car{
        int getSpeed();
    }

    public static class SimpleCar implements Car{
        private int speed = 100;

        @Override
        public int getSpeed() {
            return speed;
        }
    }

    public static class SportCar implements Car{
        private final Car car;

        public SportCar(Car car) {
            this.car = car;
        }

        @Override
        public int getSpeed() {
            return car.getSpeed() + 50;
        }
    }

    public static void main(String[] args) {
        Car simpleCar = new SimpleCar();
        Car sportCar = new SportCar(simpleCar);

        System.out.println(simpleCar.getSpeed());
        System.out.println(sportCar.getSpeed());
    }
}
