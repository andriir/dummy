package com.ap.dummyapp;

import java.io.Console;

/**
 * User: Andrew Redko
 * Date: 6/8/15
 * Time: 10:31 AM
 */
public class GenericEntityServiceImpl<T extends Fuel> {
    T save(T entity) {
        return entity;
    }

    public Long test() {
        return null;
    }
}
