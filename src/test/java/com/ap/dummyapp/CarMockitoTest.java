package com.ap.dummyapp;

import org.testng.annotations.Test;
import static org.mockito.Mockito.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

@Test
public class CarMockitoTest {
    private Car myFerrari = mock(Car.class);
    @Test
    public void testDefaultBehaviourOfTestDouble() {
        assertFalse(myFerrari.needsFuel(),
                "new test double should by default return false as boolean");
        assertEquals(myFerrari.getEngineTemperature(), 0.0,
                "new test double should by default return 0.0 as double");
    }

    @Test
    public void testStubbing() {
        assertFalse(myFerrari.needsFuel(),
                "new test double should return false as boolean");
        when(myFerrari.needsFuel()).thenReturn(true);
        assertTrue(myFerrari.needsFuel(),
                "after instructed, test double should return what we want");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void throwException() {
        when(myFerrari.needsFuel()).thenThrow(new RuntimeException());
        myFerrari.needsFuel();
    }
}