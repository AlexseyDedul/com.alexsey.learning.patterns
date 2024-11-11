package com.alexsey.learning.patterns.generating_patterns.factory;

public class FactoryMethod {

    public static class Employee{
        public void doSomething(){
            System.out.println("do something...");
        }
    }

    public static class Sales extends Employee{
        @Override
        public void doSomething(){
            System.out.println("sale...");
        }
    }

    public static class Proger extends Employee{
        @Override
        public void doSomething(){
            System.out.println("prog...");
        }
    }

    public static abstract class Department{
        public abstract Employee createEmployee();
    }

    public static class SalesDepartment extends Department{

        @Override
        public Employee createEmployee() {
            return new Sales();
        }
    }

    public static class ITDepartment extends Department{

        @Override
        public Employee createEmployee() {
            return new Proger();
        }
    }

    public static void main(String... args){
        ITDepartment itDepartment = new ITDepartment();
        Employee itEmployee = itDepartment.createEmployee();
        itEmployee.doSomething();

        SalesDepartment salesDepartment = new SalesDepartment();
        Employee salesEmployee = salesDepartment.createEmployee();
        salesEmployee.doSomething();
    }
}
