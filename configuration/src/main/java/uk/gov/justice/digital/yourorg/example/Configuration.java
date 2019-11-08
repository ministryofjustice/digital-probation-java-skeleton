package uk.gov.justice.digital.yourorg.example;


public class Configuration {
    @Configuration
    @EnableSwagger2
    public class SpringFoxConfig {
        @Bean
        public Docket apiDocket() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any())
                    .build();
        }
    }
}
