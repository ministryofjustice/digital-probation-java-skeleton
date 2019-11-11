package uk.gov.justice.digital.yourorg.example.services;

import org.springframework.stereotype.Component;
import uk.gov.justice.digital.yourorg.example.models.ExampleModel;

@Component
public class ExampleService {
    
    public ExampleModel getExample() {
        
        ExampleModel exampleModel = new ExampleModel();
        exampleModel.setExample("Example Project");
        
        return exampleModel;
    }
}
