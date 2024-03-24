package ca.qurtuba.app001membersapprovalletter.controller;

import ca.qurtuba.app001membersapprovalletter.domain.Client;
import ca.qurtuba.app001membersapprovalletter.domain.ClientResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientsController {

    // TO Read Data
    @RequestMapping(path = "/clientName",method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClientResponse> getName(){
        ClientResponse clientResponse = new ClientResponse();
        Client client = new Client();
        client.setFirstName("Nour");
        client.setLastName("Eddin");
        clientResponse.setFirstName("Hussam Eddin");
        clientResponse.setLastName("shleh");
        clientResponse.setDob("1987");
        clientResponse.setClient(client);
        return new ResponseEntity<>(clientResponse, HttpStatus.OK);
    }

    // Homework
    /*
    * Create new Request mapping with GET method , path /qurtabaaccounment consumens JSON
    * Return ResponseEntity with Accountment Object with status 201
    * Accountment object has 3 properties (title/String , Date/String, URL/String)
    * Do Setters and Getters
    * */

    // TO Create Data
    @RequestMapping(path = "/clientName1",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
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
