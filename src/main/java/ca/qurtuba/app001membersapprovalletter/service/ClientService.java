package ca.qurtuba.app001membersapprovalletter.service;

import ca.qurtuba.app001membersapprovalletter.domain.About.About;
import ca.qurtuba.app001membersapprovalletter.domain.Announcement.AnnouncementRequest;
import ca.qurtuba.app001membersapprovalletter.domain.Client.Client;
import ca.qurtuba.app001membersapprovalletter.domain.Client.ClientResponse;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements ClientsService{

    @Override
    public ClientResponse buildClientResponse() {
        ClientResponse clientResponse = new ClientResponse();
        Client client = new Client();

        client.setFirstName("Nour");
        client.setLastName("Eddin");
        clientResponse.setFirstName("Hussam Eddin");
        clientResponse.setLastName("shleh");
        clientResponse.setDob("1987");
        clientResponse.setWifeName("Test Wife name");
        clientResponse.setClient(client);
        return clientResponse;
    }

    @Override
    public AnnouncementRequest buildClientAnnouncement() {
        AnnouncementRequest announcementRequest = new AnnouncementRequest();
        return announcementRequest;
    }

    @Override
    public String welcomeMessage() {
        return "Welcome to Qurtuba";
    }

    @Override
    public About getAboutData() {
        About about = new About();
        return null;
    }


}
