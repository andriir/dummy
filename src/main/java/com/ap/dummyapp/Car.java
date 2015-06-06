package com.ap.dummyapp;

/**
 * Created by Andrew Redko on 6/5/15.
 */
public interface Car {
    boolean needsFuel();
    double getEngineTemperature();
    void driveTo(String destination);
}