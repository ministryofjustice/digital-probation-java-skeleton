package uk.gov.justice.digital.org_replace.skeleton_replace.endpoints;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Test;
import uk.gov.justice.digital.org_replace.helpers.Helper;

public class Skeleton_ReplaceTest {
    
    @Test
    public void example_endpoint_returns_content() {
        String url = Helper.getServiceAddress();
        
        given()
            .when()
            .get(url + "/")
        .then()
            .statusCode(200)
            .and()
            .body("example", equalTo("Example Project"));
    }
    
}
