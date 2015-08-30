package com.ap.dummyapp;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * User: Andrew Redko
 * Date: 6/8/15
 * Time: 11:10 AM
 */
public class EasyCarTest {


    @Before
    public void injectMockEntityManager() {

    }

    @Test
    public void callSuperTest() {
        Gas g = new Gas();
        g.name = "Gas 95";

        PackageServiceImpl packageService = EasyMock.createMock(PackageServiceImpl.class);

        EasyMock.expect(packageService.save(g)).andReturn(g);

        EasyMock.replay(packageService);

        FerarriCar sut = new FerarriCar();
        sut.setPackageService(packageService);
        sut.setFuel(g);
        Fuel result = sut.getFuel();
        assertEquals(result, g);


        EasyMock.verify(packageService);
    }
}
