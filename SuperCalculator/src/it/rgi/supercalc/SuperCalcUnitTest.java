/**
 * 
 */
package it.rgi.supercalc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Atterol
 *
 */
public class SuperCalcUnitTest {
	
	private SuperCalc sc;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		sc = new SuperCalc();
		assertNotNull(sc);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		sc = null;
		assertNull(sc);
	}

	@Test
	public void testSum() {
		int op1=10, op2 =30;
		int sum = sc.sum(op1, op2);
		
		assertEquals("Sum is not correct", 40, sum);
	}
	
	public void testSub() {
		int op1=40, op2 =30;
		int sub = sc.sum(op1, op2);
		
		assertEquals("Sub is not correct", 10, sub);
	}
	
	public void testMul() {
		int op1=40, op2 =30;
		int mul = sc.sum(op1, op2);
		
		assertEquals("Mul is not correct", 1200, mul);
	}

}
