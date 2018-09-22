package junit.jenkins.com.JunitTestJekins;

import java.io.File;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	System.out.println("teset ny user");
    	
    	File file = new File("C:\\Users\\user\\Downloads\\swetha.text");
    	
    	 if(file.exists()) {
    		 
    		 System.out.println("Sorry file exist not able to created");
    	 }else {
			
    		 
    		 file.mkdirs();
    		 
    		 System.out.println("file created");
		}
    	
    			
        assertTrue( true );
    }
}
