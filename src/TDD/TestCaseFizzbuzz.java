package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCaseFizzbuzz {
	FizzBuzz fizzBuzz = new FizzBuzz();
	int i = fizzBuzz.getint(1);
	int i2 = fizzBuzz.getint(2);
	@Test
	void input_is_1_expect_output_1() {
		assertEquals(1,i);
	}
	
	@Test //2
	void input_is_2_expect_output_2() {
		assertEquals(2,i2);
	}

}
