package ca.qurtuba.app001membersapprovalletter.service;

import ca.qurtuba.app001membersapprovalletter.domain.Announcement;
import ca.qurtuba.app001membersapprovalletter.domain.ClientResponse;

public interface ClientsService {

    ClientResponse buildClientResponse();

    Announcement buildClientAnnouncement();
}
