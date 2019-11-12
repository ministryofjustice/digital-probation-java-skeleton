package uk.gov.justice.digital.org_replace.helpers;

public class Helper {
    
    private static final String BASE_URL = "baseUrl";
    private static final String PORT = "port";
    private static final String LOCAL_ADDRESS = "http://localhost:4000";
    
    public static String getServiceAddress() {
        String url = System.getenv(BASE_URL) + ":" + System.getenv(PORT);
        if (url.contentEquals(":")) {
            url = LOCAL_ADDRESS;
        }
        return url;
    }
}
