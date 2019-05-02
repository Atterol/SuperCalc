/**
 * 
 */
package it.rgi.supercalc;

/**
 * @author Atterol
 *
 */
public class SuperCalcTest {

	/**
	 * Constructor
	 */
	public SuperCalcTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SuperCalc sc = new SuperCalc();
		
		int op1 = 20, op2= 30;
		int sum = sc.sum(op1,op2);
		int sub = sc.sub(op1,op2);
		
		System.out.println("Somma : " + op1 + " + " + op2 + " = " + sum);
		System.out.println("Sottrazione : " + op1 + " - " + op2 + " = " + sub);
	}

}
