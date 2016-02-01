package souk.jenkins1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class WagenparkbeheerTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public WagenparkbeheerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Wagenparkbeheer.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	int k = 5;
        assertEquals(k, 5);
    }
}
