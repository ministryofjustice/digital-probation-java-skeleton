package uk.gov.justice.digital.yourorg.example.resources;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;
import uk.gov.justice.digital.yourorg.example.models.ExampleModel;

public class ExampleControllerTest {
           
    @Before
    public void setUp() {
    }
    
    @Test
    public void index_returns_content() {
        
        ExampleController exampleController = new ExampleController();

        ResponseEntity response = exampleController.index();
        
        assertEquals(ResponseEntity.ok(), response.getStatusCode());
        assertEquals(ResponseEntity.ok(), response.getHeaders());
        assertEquals("Example Project", ((ExampleModel)response.getBody()).getExample());
    }
    
}
