package com.alexsey.learning.patterns.generating_patterns.prototype;

public class Prototype {
    public static class Passport implements Cloneable{
        private String series;
        private String number;

        public String getSeries() {
            return series;
        }

        public void setSeries(String series) {
            this.series = series;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        @Override
        public Passport clone() {
            try {
                Passport clone = (Passport) super.clone();
                return clone;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }

    public static class Person implements Cloneable{
        private String name;
        private int age;
        private Passport passport;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Passport getPassport() {
            return passport;
        }

        public void setPassport(Passport passport) {
            this.passport = passport;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", passport=" + passport +
                    '}';
        }

        @Override
        public Person clone() {
            try {
                Person clone = (Person) super.clone();
                clone.passport = passport.clone();
                return clone;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }

    public static void main(String[] args) {
        Passport passport = new Passport();
        passport.setSeries("123");
        passport.setNumber("BM");

        Person person = new Person();
        person.setName("Alex");
        person.setAge(26);
        person.setPassport(passport);

        System.out.println(person);

        Person person1 = person.clone();
        System.out.println(person1);
    }
}
