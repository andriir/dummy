//package com.ap.dummyapp;
//
////import org.testng.annotations.Test;
////import static org.mockito.Mockito.*;
//
//
//import org.easymock.EasyMock;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;
//import static org.easymock.EasyMock.*;
//
//import static org.powermock.api.easymock.PowerMock.createMock;
//import static org.powermock.api.easymock.PowerMock.replay;
//
//@RunWith(PowerMockRunner.class)
//@PrepareForTest( { Client.class })
//public class MessengerTest {
//    private static final String CLIENT_EMAIL = "some@email.com";
//    private static final String MSG_CONTENT = "Dear John! You are fired.";
////    @Test
//    public void shouldSendEmail() {
//        Template template = createMock(Template.class);
//        Client client = createMock(Client.class);
//        MailServer mailServer = createMock(MailServer.class);
//        TemplateEngine templateEngine = createMock(TemplateEngine.class);
//
//        expect(client.getEmail()).andReturn(CLIENT_EMAIL);
//        expect(templateEngine.prepareMessage(template, client)).andReturn(MSG_CONTENT);
//        mailServer.send(CLIENT_EMAIL, MSG_CONTENT);
//        EasyMock.expectLastCall();
//
//        replay(client);
//        replay(template);
//        replay(mailServer);
//
//        Messenger sut = new Messenger(mailServer, templateEngine);
//        sut.sendMessage(client, template);
//        verify(mailServer);
//    }
//}
