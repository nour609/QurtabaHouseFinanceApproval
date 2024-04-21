package ca.qurtuba.app001membersapprovalletter.controller;

import ca.qurtuba.app001membersapprovalletter.domain.About.About;
import ca.qurtuba.app001membersapprovalletter.domain.Client.ClientResponse;
import ca.qurtuba.app001membersapprovalletter.domain.Announcement.AnnouncementRequest;
import ca.qurtuba.app001membersapprovalletter.domain.Member.MemberResponse;
import ca.qurtuba.app001membersapprovalletter.service.ClientService;

import ca.qurtuba.app001membersapprovalletter.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientsController {

    // To access OPENAPI Doc http://localhost:8080/swagger-ui/index.html#/
    @Autowired
    private ClientService clientService;

    @Autowired
    private MemberService memberService;

    @RequestMapping(path = "/welcome", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> welcomeMessage(){
        String message = clientService.welcomeMessage();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    // Cerate new Request mapping for /about endpoint
    @RequestMapping (path = "/about", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<About> AboutUs(){
        About about = clientService.getAboutData();
        return new ResponseEntity<>(about, HttpStatus.OK);
    }


    // Cerate new Request to show the number of members
    @RequestMapping (path = "/totalMembers", method = RequestMethod.GET , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MemberResponse> totalMembers(){
        MemberResponse totalMembers = memberService.getAllMembers();
        return new ResponseEntity<>(totalMembers, HttpStatus.OK);
    }

    // TO Read Data

    @RequestMapping(path = "/clientName", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClientResponse> getName(){
        ClientResponse clientResponse = clientService.buildClientResponse();
        return new ResponseEntity<>(clientResponse, HttpStatus.OK);
    }

    @RequestMapping(path = "/qurtubaannouncement", method = RequestMethod.GET , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AnnouncementRequest> qurtubaAnnouncement() {
        AnnouncementRequest announcementRequest = clientService.buildClientAnnouncement();

        return new ResponseEntity<>(announcementRequest, HttpStatus.OK);
    }

    @RequestMapping(path = "/Memebers", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MemberResponse> getNumbersOfMember () {

        MemberResponse memberResponse = memberService.getAllMembers();
        return new ResponseEntity<>(memberResponse, HttpStatus.OK);

    }

/*
    @RequestMapping(path = "/MemebersQ1", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MemberResponse> getMembersParticipatedWithinQ1 () {
        MemberResponse memberQ1 = MemberService.AllMembers();
        return new ResponseEntity<>(members, HttpStatus.OK);

    }
*/


    @RequestMapping(path = "/createClient",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getName1(){
        return "";
    }

    // TO Delete Data
    @RequestMapping(name = "", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String getName2(){
        return "";
    }

    // TO Modify Data
    @RequestMapping(name = "", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String getName4(){
        return "";
    }

}
