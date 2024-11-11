package com.alexsey.learning.patterns.structure_patterns.bridge;

import com.alexsey.learning.patterns.structure_patterns.adapter.Adapter;

public class Bridge {

    public static abstract class Shape{
        protected final Color color;

        protected Shape(Color color) {
            this.color = color;
        }

        public abstract void draw();
    }

    public static class Rectangle extends Shape{
        public Rectangle(Color color){
            super(color);
        }

        @Override
        public void draw() {
            System.out.println("Draw Rectangle");
            color.fillColor();
        }
    }

    public static class Circle extends Shape{
        public Circle(Color color){
            super(color);
        }

        @Override
        public void draw() {
            System.out.println("Draw Circle");
            this.color.fillColor();
        }
    }

    public interface Color{
        void fillColor();
    }

    public static class Red implements Color{

        @Override
        public void fillColor() {
            System.out.println("Red");
        }
    }

    public static class Blue implements Color{

        @Override
        public void fillColor() {
            System.out.println("Blue");
        }
    }

    public static void main(String[] args) {
        Color blue = new Blue();
        Color red = new Red();

        Shape rectangle = new Rectangle(blue);
        Shape circle = new Circle(red);

        rectangle.draw();
        circle.draw();
    }
}
