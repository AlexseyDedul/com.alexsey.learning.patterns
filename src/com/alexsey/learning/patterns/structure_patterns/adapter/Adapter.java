package com.alexsey.learning.patterns.structure_patterns.adapter;

public class Adapter {
    public interface Roundable{
        double getRadius();
    }

    public static class RoundPeg implements Roundable{
        private final double radius;

        public RoundPeg(double radius){
            this.radius = radius;
        }

        @Override
        public double getRadius() {
            return radius;
        }
    }

    public static class RoundHole implements Roundable{
        private final double radius;

        public RoundHole(double radius){
            this.radius = radius;
        }

        @Override
        public double getRadius() {
            return radius;
        }

        public boolean insert(Roundable roundable){
            return this.getRadius() >= roundable.getRadius();
        }
    }

    public static class SquarePeg{
        private final double side;

        public SquarePeg(double side) {
            this.side = side;
        }

        public double getSide(){
            return this.side;
        }

        public double getArea(){
            return Math.pow(side, 2);
        }
    }

    public static class SquarePegAdapter
            extends SquarePeg
            implements Roundable{

        public SquarePegAdapter(double side) {
            super(side);
        }

        @Override
        public double getRadius() {
            return getSide() * Math.sqrt(2)/2;
        }
    }

    public static void main(String[] args) {
        RoundHole roundableHole = new RoundHole(10);
        RoundPeg roundablePeg = new RoundPeg(11);
        RoundPeg roundPeg2 = new RoundPeg(6);

        SquarePegAdapter squarePegAdapter1 = new SquarePegAdapter(5);
        SquarePegAdapter squarePegAdapter2 = new SquarePegAdapter(15);

        System.out.println("roundablePeg insert into roundableHole - " + roundableHole.insert(roundablePeg));
        System.out.println("roundPeg2 insert into roundableHole - " + roundableHole.insert(roundPeg2));
        System.out.println("squarePegAdapter1 insert into roundableHole - " + roundableHole.insert(squarePegAdapter1));
        System.out.println("squarePegAdapter2 insert into roundableHole - " + roundableHole.insert(squarePegAdapter2));
    }
}
