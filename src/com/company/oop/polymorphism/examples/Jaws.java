package com.company.oop.polymorphism.examples;

public class Jaws extends Movie{

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Shark eats lots of people.";
    }
}
