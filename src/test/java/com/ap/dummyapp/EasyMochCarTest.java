package com.ap.dummyapp;

import org.easymock.EasyMock;
import org.easymock.IMockBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.powermock.api.easymock.PowerMock.createMock;
import static org.powermock.api.easymock.PowerMock.replay;

@RunWith(PowerMockRunner.class)
@PrepareForTest({FerarriCar.class})
public class EasyMochCarTest {
    private static final String CLIENT_EMAIL = "some@email.com";
    private static final String MSG_CONTENT = "Dear John! You are fired.";

//    @Test
    public void callSuperTest() {
        Gas g = new Gas();
        g.name = "Gas 95";

        AbstractCar<Gas> abstractCar = createMock(AbstractCar.class);

        expect(abstractCar.getFuel()).andReturn(g);

        replay(abstractCar);

        FerarriCar sut = new FerarriCar();
        Fuel result = sut.getFuel();
        assertEquals(result, g);
        verify(abstractCar);
    }

    @Test
    public void callThisTest() {
        Gas g = new Gas();
        g.name = "Gas 95";

        final IMockBuilder<AbstractCar> mockBuilder = EasyMock.createMockBuilder(AbstractCar.class);
        mockBuilder.addMockedMethod("getFuel");
        final AbstractCar<Gas> mockedChild = mockBuilder.createMock();

        EasyMock.expect(mockedChild.getFuel()).andReturn(g);
        EasyMock.replay(mockedChild);

        //Whatever else happens in your test

        FerarriCar sut = new FerarriCar();
        Fuel result = sut.getFuel();
        verify(mockedChild);
        assertEquals(result, g);
    }
}
