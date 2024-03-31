package ca.qurtuba.app001membersapprovalletter.controller;

import ca.qurtuba.app001membersapprovalletter.domain.ClientResponse;
import ca.qurtuba.app001membersapprovalletter.domain.Announcement;
import ca.qurtuba.app001membersapprovalletter.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientsController {

    // To access OPENAPI Doc http://localhost:8080/swagger-ui/index.html#/
    @Autowired
    public ClientService clientService;

    // TO Read Data
    @RequestMapping(path = "/clientName",method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClientResponse> getName(){
        ClientResponse clientResponse = clientService.buildClientResponse();
        return new ResponseEntity<>(clientResponse, HttpStatus.OK);
    }

    @RequestMapping(path = "/qurtubaannouncement", method = RequestMethod.GET , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Announcement> qurtubaAnnouncement() {
        Announcement announcement = new Announcement();
        announcement.setDate("");
        announcement.setPath("");
        announcement.setTitle("This is the title");

        return new ResponseEntity<>(announcement, HttpStatus.OK);
    }

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
