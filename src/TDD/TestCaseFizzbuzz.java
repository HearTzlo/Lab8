package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCaseFizzbuzz {
	FizzBuzz fizzbuzz = new FizzBuzz();
	String input1 = fizzbuzz.getnumber1(1);
	String wordF ="Fizz";
	String wordB ="Buzz";
	String wordFB = "FizzBuzz";
	
	@Test
	void test1() {
		assertEquals("1", input1);
	}
	
}
