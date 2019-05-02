/**
 * 
 */
package it.rgi.supercalc;

/**
 * @author Atterol
 *
 */
public class SuperCalc {

	private int ret; 
	/**
	 * Constructor of SuperCalc class
	 * <p>
	 * Description
	 */
	
	public SuperCalc() {
	}
	/**
	 * Sum
	 * <p>
	 * @param op1 first param 
	 * @param op2 second param
	 * @return sum of op1+op2
	 */
	public int sum(int op1, int op2) {
		ret= op1+op2;
		return ret;
	}

	public int sub(int op1,int op2) {
		ret= op1-op2;
		return ret;
	}
	
	public int mul(int op1,int op2) {
		ret= op1*op2;
		return ret;
	}
	
}
