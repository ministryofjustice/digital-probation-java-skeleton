package uk.gov.justice.digital.yourorg.example.services;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.MockitoAnnotations.initMocks;
import uk.gov.justice.digital.yourorg.example.models.ExampleModel;

public class ExampleServiceTest {
    
    @Before
    public void setUp() {
        initMocks(this);
    }
    
    @Test
    public void index_calls_service() {
        
        ExampleService exampleService = new ExampleService();
        
        ExampleModel model = exampleService.getExample();
        
        assertEquals("Example Project", model.getExample());
    }
    
}
