package ca.qurtuba.app001membersapprovalletter.service;

import ca.qurtuba.app001membersapprovalletter.domain.Client.ClientResponse;
import ca.qurtuba.app001membersapprovalletter.domain.Announcement.AnnouncementRequest;
import ca.qurtuba.app001membersapprovalletter.domain.About.About;

import ca.qurtuba.app001membersapprovalletter.domain.Client.Client;
import ca.qurtuba.app001membersapprovalletter.domain.Member.MemberResponse;
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
    public About getAboutData() {
        About about = new About();
        about.setContactNumber("123456");
        about.setEmailAddress("nour@hotmail.com");
        return about;
    }


    @Override
    public String welcomeMessage() {
        return "Welcome to Qurtuba";
    }

    @Override
    public String email() {
        return "nour@qurtuba.ca";
    }

    @Override
    public String totalMembers() {
        return "300";
    }



}
