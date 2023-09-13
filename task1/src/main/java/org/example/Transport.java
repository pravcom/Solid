package org.example;

public abstract class Transport {
    private Battery battery;
    private Engine engine;

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
}
