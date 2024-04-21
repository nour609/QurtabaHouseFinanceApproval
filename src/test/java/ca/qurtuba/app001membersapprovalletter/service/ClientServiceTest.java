package ca.qurtuba.app001membersapprovalletter.service;

import ca.qurtuba.app001membersapprovalletter.domain.About.About;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ClientServiceTest {

    private ClientService clientService = mock();

    @Test
    public void getAboutDataTest(){
        About about = new About();
        about.setEmailAddress("TestEmail@email.com");
        about.setContactNumber("1111112");

        when(clientService.getAboutData()).thenReturn(about);

        About aboutResponse = clientService.getAboutData();
        Assertions.assertNotNull(aboutResponse);
        Assertions.assertEquals("1111112", aboutResponse.getContactNumber());
        Assertions.assertEquals("TestEmail@email.com", aboutResponse.getEmailAddress());
    }

}
