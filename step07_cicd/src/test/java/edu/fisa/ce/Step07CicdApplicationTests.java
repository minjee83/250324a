package edu.fisa.ce;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Step07CicdApplicationTests {
	
	@Test
	public void testAddition() {
		int result = 12 + 3;
		
		
		System.out.println("비교 전*******************");
		assertEquals(15, result);
		
		System.out.println("비교 후*******************");
	}
}
