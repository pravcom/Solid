package org.example;

public class Bike extends Transport{
    private Object  carburetor;// Карбюратор

    public void setCarburetor(Object carburetor) {
        this.carburetor = carburetor;
    }

    public Object getCarburetor() {
        return carburetor;
    }
}
