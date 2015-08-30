package com.ap.dummyapp;

//import org.easymock.Mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;


//import static org.easymock.EasyMock.expect;
//import static org.easymock.EasyMock.verify;

/**
 * User: Andrew Redko
 * Date: 6/8/15
 * Time: 10:27 AM
 */
//@RunWith(PowerMockRunner.class)
//@PrepareForTest( { Client.class })
//@RunWith(PowerMockRunner.class)
public class MockitoCarTest {

    @Mock
    private PackageServiceImpl packageService;

    @InjectMocks
    private FerarriCar sut;

    @Before
    public void injectMockEntityManager() {
        sut = new FerarriCar();
        MockitoAnnotations.initMocks(this);   // Injects Mocks into CUT
    }

    @Test
    public void callSuperTest() {
        Gas g = new Gas();
        g.name = "Gas 95";

//        PackageServiceImpl packageService = createMock(PackageServiceImpl.class);

        Mockito.when(packageService.save(g)).thenReturn(g);

//        FerarriCar sut = new FerarriCar();
//        sut.setPackageService(packageService);
        sut.setFuel(g);
        Fuel result = sut.getFuel();
        assertEquals(result, g);


        Mockito.verify(packageService);
    }
}
