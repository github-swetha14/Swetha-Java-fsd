package com.app.junitDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsJunitDemo {

	@Test
	public void testAssertions() {

		String expected = new String("abc");
		String actual = new String("abc");

		String str1 = "JUnit";
		String str2 = null;

		String s1 = "Saras";
		String s2 = "Saras";

		int v1 = 20;
		int v2 = 30;

		String[] array1 = { "one", "two", "three" };
		String[] array2 = { "one", "two", "three" };

		// Assertions.assertEquals(expected,actual);

		// Assertions.assertNotNull(str1);
		// Assertions.assertNotNull(str2);

		// Assertions.assertNotSame(s1, s2);
		// Assertions.assertSame(s1, s2);

		// Assertions.assertTrue(v1<v2);

		Assertions.assertArrayEquals(array1, array2);

	}
}
