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
        return new TestSuite( WagenparkbeheerTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Wagenparkbeheer w1 = new Wagenparkbeheer();
    	w1.ignition();
    	assertEquals(23, w1.UnitIds.size());
    }
}
