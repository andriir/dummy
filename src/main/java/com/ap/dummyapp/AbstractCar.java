package com.ap.dummyapp;

/**
 * Created by Andrew Redko on 6/7/15.
 */
public abstract class AbstractCar<T extends Fuel> implements Car {
    protected Fuel fuel;

    public void setPackageService(GenericEntityServiceImpl<Fuel> packageService) {
        this.packageService = packageService;
    }

    GenericEntityServiceImpl<Fuel> packageService;



    GenericEntityServiceImpl<Fuel> getService() {
        return packageService;
    }


    @Override
    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    @Override
    public Fuel getFuel() {
//        packageService.test();
        return packageService.save(this.fuel);
    }
}
