package uk.gov.justice.digital.yourorg.example.resources;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.gov.justice.digital.yourorg.example.models.ExampleModel;

@RestController
public class ExampleController {
    
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity index() {
    
        ExampleModel exampleModel = new ExampleModel();
        exampleModel.setExample("Example Project");
        
       return ResponseEntity.ok(exampleModel);
    }
    
}
