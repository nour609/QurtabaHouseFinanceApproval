package ca.qurtuba.app001membersapprovalletter.service;

import ca.qurtuba.app001membersapprovalletter.domain.Announcement;
import ca.qurtuba.app001membersapprovalletter.domain.Client;
import ca.qurtuba.app001membersapprovalletter.domain.ClientResponse;
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
    public Announcement buildClientAnnouncement() {
        Announcement announcement = new Announcement();
        announcement.setDate("");
        announcement.setPath("");
        announcement.setTitle("This is the title");

        return announcement;
    }
}
