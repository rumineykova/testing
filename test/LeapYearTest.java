import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapYearTest {

	@Test
    public void DivisibleBy4AndNot100ShouldBeLeapYear()
    {   // 1996 is a NormalLeapYear  //Arrange
		int testInput = 1996; //Arrange
		boolean res = LeapYear.IsLeapYear(testInput); //Act
		assertTrue(res); //Assert
    }

	@Test
    public void NotDivisibleByShouldNOTBeLeapYear()
    {   // 2001 is a NormalLeapYear  //Arrange
		int testInput = 2001; //Arrange
		boolean res = LeapYear.IsLeapYear(testInput); //Act
		assertFalse(res); //Assert 	
    }
	@Test
    public void DivisibleBy4And100And400ShouldBeLeapYear()
    {   // 2000 is a NormalLeapYear  //Arrange
		int testInput = 2000; //Arrange
		boolean res = LeapYear.IsLeapYear(testInput); //Act
		assertTrue(res); //Assert
    }
	
	@Test
    public void DivisibleBy4And100AndNOT400ShouldNOTBeLeapYear()
    {   // 1900 is a not a leap year  //Arrange
		int testInput = 1900; //Arrange
		boolean res = LeapYear.IsLeapYear(testInput); //Act
		assertFalse(res); //Assert
    }
}
