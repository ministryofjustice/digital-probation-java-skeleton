
package uk.gov.justice.digital.yourorg.example;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;

@RunWith(MockitoJUnitRunner.class)
public class ExampleConfigurationTest {
   
    @Mock
    Docket mockDocket;
    
    @Mock
    ApiSelectorBuilder apiSelectorBuilder;
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    } 
   
   @Test
   public void apiDocket_is_correct_type(){
       
        ExampleConfiguration exampleConfiguration = new ExampleConfiguration();
       
        Docket docket = exampleConfiguration.apiDocket();
        assertEquals(DocumentationType.SWAGGER_2, docket.getDocumentationType());
   }
   
   @Test
   public void apiDocket_is_configured_all_paths(){
       
        ExampleConfiguration exampleConfiguration = new ExampleConfiguration();
        when(apiSelectorBuilder.apis(RequestHandlerSelectors.any())).thenReturn(apiSelectorBuilder);
        when(apiSelectorBuilder.paths(PathSelectors.any())).thenReturn(apiSelectorBuilder);
        when(apiSelectorBuilder.build()).thenReturn(mockDocket);
        when(mockDocket.select()).thenReturn(apiSelectorBuilder);
                
        exampleConfiguration.configureDocket(mockDocket);

        verify(apiSelectorBuilder, times(1)).apis(RequestHandlerSelectors.any());      
        verify(apiSelectorBuilder, times(1)).paths(PathSelectors.any());      
        verify(apiSelectorBuilder, times(1)).build();  
        verify(mockDocket, times(1)).select();
   }
}
