import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapYearTest {

	@Test
    public void DivisibleBy4AndNot100ShouldBeLeapYear()
    { // 1996 is a NormalLeapYear 
    }

	@Test
    public void NotDivisibleBy4ShouldNotBeLeapYear()
    { // 2001 is a NormalCommonYear 
		
    }

	@Test
    public void DivisibleBy4And100ShouldNotBeLeapYear()
    { // 1900 is a SpecialCommonYear 
    }

    @Test
    public void DivisibleBy100And400YearShouldBeLeapYear()
    { // 2000 is a SpecialLeapYear 
    }
}
