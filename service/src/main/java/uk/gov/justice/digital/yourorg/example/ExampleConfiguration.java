package uk.gov.justice.digital.yourorg.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class ExampleConfiguration {
    
    @Bean
    public Docket apiDocket() {
        return configureDocket(new Docket(DocumentationType.SWAGGER_2));
    }
    
    protected Docket configureDocket(Docket apiDocket) {
       return apiDocket.select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build();
    }
}
