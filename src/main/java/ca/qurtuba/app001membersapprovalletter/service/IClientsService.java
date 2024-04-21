package ca.qurtuba.app001membersapprovalletter.service;

import ca.qurtuba.app001membersapprovalletter.domain.About.About;
import ca.qurtuba.app001membersapprovalletter.domain.Announcement.AnnouncementRequest;
import ca.qurtuba.app001membersapprovalletter.domain.Client.ClientResponse;

public interface IClientsService {

    ClientResponse buildClientResponse();

    AnnouncementRequest buildClientAnnouncement();

    String welcomeMessage();


    About getAboutData();
}
