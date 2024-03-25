package com.eazybytes.eazyschool;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EazySchoolApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void twoPlusTwoShouldEqualFour(){
		EazySchoolApplication calculator = new EazySchoolApplication();
		assertEquals(4, calculator.add(2,2));
	}

}
