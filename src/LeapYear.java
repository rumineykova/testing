
// A leap year is divisible by 4, 
// but is not otherwise divisible by 100, 
// unless it is also divisible by 400.
public class LeapYear
{
    public static Boolean IsLeapYear(Integer year)
    {
    	if (year % 4 != 0)
    	{ if (year % 100 == 0) 
    			{ if (year % 400 == 0) 
    	    		{ return true;} 
    			  else { return false;} 
    	         } 
    		else { return true;}
    	} else {
    		return false;
    	 }
    }
    
    // a typical leap year is one that is divisible by 4 
    private static Boolean IsDivisibleBy4(Integer year)
    {
        return (year % 4 != 0);
    }

    // a typical leap year is one that devides by 4
    private static Boolean IsDivisibleBy100(Integer year)
    {
        return (year % 100 == 0);
    }
    
    private static Boolean IsDivisibleBy400(Integer year)
    {
        return (year % 400 == 0);
    }
}
