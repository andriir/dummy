package com.ap.dummyapp;

/**
 * Created by Andrew Redko on 6/7/15.
 */
public class FerarriCar extends AbstractCar<Gas> implements Car {

    @Override
    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    @Override
    public Fuel getFuel() {
        return super.getFuel();
    }

}
