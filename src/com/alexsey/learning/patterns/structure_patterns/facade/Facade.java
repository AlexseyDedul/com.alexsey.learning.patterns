package com.alexsey.learning.patterns.structure_patterns.facade;

import com.alexsey.learning.patterns.structure_patterns.bridge.Bridge;

public class Facade {

    public static abstract class Shape{
        public abstract void draw();
    }

    public static class Rectangle extends Shape {

        @Override
        public void draw() {
            System.out.println("Draw Rectangle");
        }
    }

    public static class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Draw Circle");
        }
    }

    public static class Triangle extends Shape {
        @Override
        public void draw() {
            System.out.println("Draw Triangle");
        }
    }

    public static class ShapeFacade{
        private final Shape circle;
        private final Shape rectangle;
        private final Shape triangle;

        public ShapeFacade() {
            this.circle = new Circle();
            this.rectangle = new Rectangle();
            this.triangle = new Triangle();
        }

        public void draw(String shape){
            switch (shape){
                case "circle":
                    circle.draw();
                    break;
                case "rectangle":
                    rectangle.draw();
                    break;
                case "triangle":
                    triangle.draw();
                    break;
                default:
                    System.out.println("Unknown shape");
            }
        }
    }

    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.draw("circle");
    }
}
