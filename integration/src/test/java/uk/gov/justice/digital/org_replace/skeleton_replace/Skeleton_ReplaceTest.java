package uk.gov.justice.digital.org_replace.skeleton_replace;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Skeleton_ReplaceTest {
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void index_returns_content() {
        ExampleController skeleton_Replace = new ExampleController();

        String response = skeleton_Replace.index();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
