import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testAdd() {
		// fail("Not yet implemented");
		int a = 4444;
		int b = 4444;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 8888;
		assertEquals(actual, expected);

	}

	@Test
	public void testSubtract() {
		// fail("Not yet implemented");
		int a = 9888;
		int b = 5444;

		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);

		int expected = 4444;
		assertEquals(actual, expected);

	}

	@Test
	public void testMultiply() {
		// fail("Not yet implemented");
		int a = 8;
		int b = 10;

		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);

		int expected = 80;
		assertEquals(actual, expected);
	}

	@Test
	public void testDivide() {
		// fail("Not yet implemented");
		int a = 16;
		int b = 4;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		int expected = 4;
		assertEquals(actual, expected);
	}
}
