import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	// START OF HELPER METHODS	
	private String GetFizzBuzzString()
    {
        return new FizzBuzzer().GetFizBuzzString();
    }

    private String GetFizzBuzzValueFor(int number)
    {
        FizzBuzzer fb = new FizzBuzzer();
        return fb.GetFizzBuzzValueFor(number);
    }
    
    // END OF HELPER METHODS	
    
    @Test
    public void FizzBuzzValueForOneShouldBeOne()
    {
    	assertEquals("1", GetFizzBuzzValueFor(1));
    }

    @Test
    public void FizzBuzzValueForTwoShouldBeTwo()
    {
    	assertEquals("2", GetFizzBuzzValueFor(2));
    }
}
