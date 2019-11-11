package uk.gov.justice.digital.yourorg.example.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.gov.justice.digital.yourorg.example.models.ExampleModel;
import uk.gov.justice.digital.yourorg.example.services.ExampleService;

@RestController
public class ExampleController {
    
    private final ExampleService exampleService;
    
    @Autowired
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }
    
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity index() {
    
        ExampleModel exampleModel = exampleService.getExample();
        
       return ResponseEntity.ok(exampleModel);
    }
    
}
