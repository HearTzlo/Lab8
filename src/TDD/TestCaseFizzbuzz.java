package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCaseFizzbuzz {
	FizzBuzz fizzBuzz = new FizzBuzz();
	int i = fizzBuzz.getint(1);
	@Test
	void input_is_1_expect_output_1() {
		int input = 0;
		assertEquals(1,i);
	}

}
