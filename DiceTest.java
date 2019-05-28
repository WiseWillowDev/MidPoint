package Pkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiceTest {
		@Test
		void test() {
			int sum = Dice.roll();
			System.out.println(sum);
		assertTrue(sum >=2 && sum <= 12);
	// implemented the function roll and class dice as dice.roll
		//printed to console then 
		//compared the number against two parameters and add the sum 
		
		
	}
		
		
		@Test
		void logictest()
		{
			assertEquals(Dice.Logic(2),"Lose");
			
	}
		@Test
		void logictest3()
		{
			assertEquals(Dice.Logic(3),"Lose");
			
		}
		@Test
		void logictest11()
		{
			assertEquals(Dice.Logic(11),"Win");
		}
		@Test
		void logictest12()
		{
			assertEquals(Dice.Logic(12),"Lose");
		}
		@Test
		void logictest7()
	{
		assertEquals(Dice.Logic(7),"Win");
	}}

