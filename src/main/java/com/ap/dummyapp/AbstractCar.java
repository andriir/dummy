package com.ap.dummyapp;

/**
 * Created by Andrew Redko on 6/7/15.
 */
public abstract class AbstractCar<T extends Fuel> implements Car {
    protected Fuel fuel;

    @Override
    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    @Override
    public Fuel getFuel() {
        return this.fuel;
    }
}
