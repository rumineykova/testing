
 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class MoneyTest extends TestCase {
    
	/* All we need in the testSimpleAdd is:
	(1) Code which creates the objects we will 
	    interact with during the test. 
	    This testing context is commonly referred to as a test's fixture.
	     All we need for the testSimpleAdd test are some Money objects.
	(2) Code which exercises the objects in the fixture.
	(3) Code which verifies the result.
	*/
	@Test
	public void testSimpleAdd() {
        Money m12CHF = new Money(12, "CHF");  // (1) Arrange
        Money m14CHF = new Money(14, "CHF");        
        Money expected = new Money(26, "CHF");
        Money result = m12CHF.add(m14CHF);    // (2) Act 
        assertTrue(expected.equals(result)); // (3) Assert
    }
	
	@Test
	public void testEquals() {
	    Money m12CHF= new Money(12, "CHF");
	    Money m14CHF= new Money(14, "CHF");
	    assertTrue(!m12CHF.equals(null));
	    assertEquals(m12CHF, m12CHF);
	    assertEquals(m12CHF, new Money(12, "CHF")); // (1)
	    assertTrue(!m12CHF.equals(m14CHF));
	}
}
