package uk.gov.justice.digital.yourorg.example.resources;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import org.springframework.http.ResponseEntity;
import uk.gov.justice.digital.yourorg.example.models.ExampleModel;
import uk.gov.justice.digital.yourorg.example.services.ExampleService;

public class ExampleControllerTest {
    
    @Mock
    private ExampleService exampleService;
    
    @Before
    public void setUp() {
        initMocks(this);
    }
    
    @Test
    public void index_calls_service() {
        
        ExampleController exampleController = new ExampleController(exampleService);
        when(exampleService.getExample()).thenReturn(new ExampleModel());
        
        exampleController.index();
        
        verify(exampleService, times(1)).getExample();      
    }
    
    @Test
    public void index_returns_content() {
        
        ExampleController exampleController = new ExampleController(exampleService);
        ExampleModel exampleModel = new ExampleModel();
        exampleModel.setExample("Example Project");
        when(exampleService.getExample()).thenReturn(exampleModel);
                
        ResponseEntity response = exampleController.index();
        
        assertEquals(ResponseEntity.ok(), response.getStatusCode());
        assertEquals(ResponseEntity.ok(), response.getHeaders());
        assertEquals("Example Project", ((ExampleModel)response.getBody()).getExample());
    }
    

}
