package ca.qurtuba.app001membersapprovalletter.service;

import ca.qurtuba.app001membersapprovalletter.domain.About.About;
import ca.qurtuba.app001membersapprovalletter.domain.Announcement.AnnouncementRequest;
import ca.qurtuba.app001membersapprovalletter.domain.Client.ClientResponse;
import ca.qurtuba.app001membersapprovalletter.domain.Member.MemberResponse;

public interface ClientsService {

    ClientResponse buildClientResponse();

    AnnouncementRequest buildClientAnnouncement();

    String welcomeMessage();


    About getAboutData();

    String email();

    String totalMembers();

    MemberResponse getMembersData();

    String About();
}
