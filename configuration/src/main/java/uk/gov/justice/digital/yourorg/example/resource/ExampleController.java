package uk.gov.justice.digital.yourorg.example.resource;

import uk.gov.justice.digitalyourorg.example.model.ExampleModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ExampleController {
    
    @GetMapping(value = "/economic-operator/{id}/tracesId",
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping("/")
    public String index() {
    
        ExampleModel exampleModel = new ExampleModel();
        
       return ResponseEntity.ok(exampleModel);
    }
    
}
