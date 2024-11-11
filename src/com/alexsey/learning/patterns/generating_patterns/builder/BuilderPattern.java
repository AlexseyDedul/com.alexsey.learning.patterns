package com.alexsey.learning.patterns.generating_patterns.builder;

public class BuilderPattern {

    public static class Person{
        private String name;
        private String lastName;
        private int age;

        public static Builder builder(){
            return new Builder();
        }

        public static final class Builder{
            private Person person;

            private Builder(){
                person = new Person();
            }

            public Builder setName(String name) {
                person.name = name;
                return this;
            }

            public Builder setLastName(String lastName) {
                person.lastName = lastName;
                return this;
            }

            public Builder setAge(int age) {
                person.age = age;
                return this;
            }

            public Person build(){
                return person;
            }
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        Person person = Person.builder()
                .setName("Alex")
                .setLastName("Ronin")
                .setAge(26)
                .build();

        System.out.println(person);
    }
}
