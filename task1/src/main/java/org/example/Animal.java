package org.example;

public abstract class Animal implements AnimalInterface{
    private double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
